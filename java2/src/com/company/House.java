package com.company;

abstract class House {
    protected double price;
    abstract void getPrice();

    public void calculateBill(int units){
        System.out.println(units*price);
    }
}
