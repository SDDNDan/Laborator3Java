package Vehicle;

import buildings.Building;
import item.Item;

public class Vehicle implements Item<Vehicle> {

    private  String name;
    private int area;
    private int price;


    @Override
    public float getProfit( Vehicle item) {
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

