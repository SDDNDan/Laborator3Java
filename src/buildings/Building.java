package buildings;

import assetManager.AssetManager;
import assets.Asset;
import item.Item;

public class Building extends Item implements Asset {

    private int area;
    private int price;

    public Building(String name, int area, int price) {
        this.name = name;
        this.area = area;
        this.price = price;
    }


    public float computeProfit() {
        return this.area/this.price;
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

    @Override
    public int getArea() {
        return this.area;
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}
