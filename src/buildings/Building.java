package buildings;

import assets.Assets;
import item.Item;

public class Building extends Item implements Assets<Building>  {

    private  String name;
    private int area;
    private int price;

    public Building(String name, int area, int price) {
        this.name = name;
        this.area = area;
        this.price = price;
    }


    public float computeProfit(Building item) {
        return this.area/this.price;
    }


    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return this.getName();
    }

    @Override
    public int getArea() {
        return this.area;
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}
