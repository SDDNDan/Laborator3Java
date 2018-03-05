package buildings;

import assetManager.AssetManager;
import assets.Asset;
import item.Item;

public class Building extends Item implements Asset {

    private double area;
    private double price;


    public Building(String name, int area, int price) {
        this.name = name;
        this.area = area;
        this.price = price;
    }


    @Override
    public String getNameAsset() {
        return this.name;
    }

    public double computeProfit() {
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
    public double getArea() {
        return this.area;
    }

    @Override
    public double getPrice() {
        return this.price;
    }
}
