package com.company;

public class LittleHouse implements Deal{
    @Override
    public String deal() {
        return "Litle House";
    }
    @Override
    public static float price(){
        return 200;
    }
}
