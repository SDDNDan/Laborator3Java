package vehicle;

import assets.Assets;
import item.Item;

public class Vehicle extends Item implements Assets<Vehicle> {

    private  String name;
    private int performance;
    private int price;

    public Vehicle(String name, int performance, int price) {
        this.name = name;
        this.performance = performance;
        this.price = price;
    }

    @Override
    public float getProfit( Vehicle item) {
        return this.performance/this.price;
    }

    public String getName() {
        return name;
    }

    public int getArea() {
        return performance;
    }

    public int getPrice() {
        return price;
    }
}

