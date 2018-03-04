package buildings;

import item.Item;

public class Building implements Item<Building> {

    private  String name;
    private int area;
    private int price;


    @Override
    public float getProfit(Building item) {
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
