package buildings;

import assetManager.AssetManager;
import assets.Asset;
import item.Item;

/**
 * Object of the problem, it is a of type Item and implements the interface Assets
 */

public class Building extends Item implements Asset {

    private double area;
    private double price;

    /**
     * Constructor
     */
    public Building(String name, int area, int price) {
        this.name = name;
        this.area = area;
        this.price = price;
    }

    /**
     * Getters
     */

    @Override
    public double getPriceAsset() {
        return this.price;
    }

    @Override
    public String getNameAsset() {
        return this.name;
    }

    /**
     * Function to calculate profit
     *
     * @return
     */
    public double computeProfit() {
        return this.area / this.price;
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
