package com.company;

public class GetHouseFactory {
    public House getHouse(String houseType){
        if(houseType == null){
            return null;
        }
        if(houseType.equalsIgnoreCase("BigHouse")) {
            return new BigHouse();
        }
        else if(houseType.equalsIgnoreCase("Apartment")){
            return new Apartment();
        }
        return null;
    }
}
