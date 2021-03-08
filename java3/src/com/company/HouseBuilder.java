package com.company;

public class HouseBuilder {
    public House preppareBigHouse(){
        House house = new House();
        house.addItem((HouseSdelka) new BigHouse());
        return house;
    }

    public House preppareLittleHouse(){
        House house = new House();
        house.addItem((HouseSdelka) new LittleHouse());
        return house;
    }
}
