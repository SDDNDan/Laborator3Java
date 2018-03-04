package Jewel;
import item.Item;

import buildings.Building;

public class Jewel implements Item<Jewel> {

    private  String name;
    private int area;
    private int price;


    @Override
    public float getProfit(Jewel item) {
        return this.area/this.price;
    }

    public String getName() {
        return name;
    }

    public int getArea() {
        return area;
    }

    public int getPrice() {
        return price;
    }
}

