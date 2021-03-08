package com.company;

public class BigHouse implements Deal{
    @Override
    public String deal() {
        return "Big House";
    }
    @Override
    public static float price(){
        return 500;
    }
}
