package com.company;

public class Builder {
    public static void main(String[] args) {

        HouseBuilder mealBuilder = new HouseBuilder();

        House vegMeal = mealBuilder.preppareBigHouse();
        System.out.println("Big house");
        vegMeal.showItems();
        System.out.println("Total Cost: " + BigHouse.price());

        House nonVegMeal = mealBuilder.preppareLittleHouse();
        System.out.println("\n\nLittle House");
        nonVegMeal.showItems();
        System.out.println("Total Cost: " + Deal.price());
    }
}
