package vehicle;

import assetManager.AssetManager;
import assets.Asset;
import item.Item;

public class Vehicle extends Item implements Asset {

    private int performance;
    private int price;

    public Vehicle(String name, int performance, int price) {
        this.name = name;
        this.performance = performance;
        this.price = price;
    }

    @Override
    public float computeProfit() {
        return (this.performance/this.price);
    }

    @Override
    public double calculateRisk(int numberOfItems) {
        AssetManager assetManager = new AssetManager();
        return assetManager.getProfit();
    }

    @Override
    public String toString() {
        return this.getName();
    }

    public int getArea() {
        return performance;
    }

    public int getPrice() {
        return price;
    }
}

