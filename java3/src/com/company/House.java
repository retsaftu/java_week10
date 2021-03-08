package com.company;
import java.util.ArrayList;
import java.util.List;

public class House {
    private List<HouseSdelka> items = new ArrayList<HouseSdelka>();

    public void addItem(HouseSdelka item){
        items.add(item);
    }

    public float getCost(){
        float cost = 0.0f;

        for (HouseSdelka item : items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems(){

        for (HouseSdelka item : items) {
            System.out.print("Item : " + item.name());
            System.out.print(", Packing : " + item.deal().deal());
            System.out.println(", Price : " + item.price());
        }
    }
}
