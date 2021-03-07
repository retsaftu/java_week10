package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class Database {
    private static Database instance;
    public Connection con = null;

    private Database(String connectionUrl) throws SQLException, ClassNotFoundException {
        try{
            Class.forName("org.postgresql.Driver");
            this.con = DriverManager.getConnection(connectionUrl, "postgres", "qwerty12345");
        } catch (Exception ex){
            System.out.println(ex.getMessage());
            throw ex;
        }
    }

    public static Database getInstance(String connectionURl) throws SQLException, ClassNotFoundException {
        if (instance == null) {
            instance = new Database(connectionURl);
        }
        return instance;
    }
}