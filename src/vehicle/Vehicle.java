package vehicle;

import assetManager.AssetManager;
import assets.Asset;
import item.Item;

/**
 * Object of the problem, it is a of type Item and implements the interface Assets
 */
public class Vehicle extends Item implements Asset {

    private double performance;
    private double price;

    /**
     * Constructor
     *
     * @param name
     * @param performance
     * @param price
     */
    public Vehicle(String name, int performance, int price) {
        this.name = name;
        this.performance = performance;
        this.price = price;
    }

    /**
     * Getter of price
     *
     * @return
     */
    @Override
    public double getPriceAsset() {
        return this.price;
    }

    /**
     * Getter of name
     *
     * @return
     */
    @Override
    public String getNameAsset() {
        return this.name;
    }

    /**
     * Function that calculates profit
     *
     * @return
     */

    @Override
    public double computeProfit() {
        return (this.performance / this.price);
    }

    /**
     * Function that calculates risk
     *
     * @param numberOfItems
     * @return
     */
    @Override
    public double calculateRisk(int numberOfItems) {
        AssetManager assetManager = new AssetManager();
        return assetManager.getProfit();
    }

    /**
     * String overrider
     *
     * @return
     */
    @Override
    public String toString() {
        return this.getName();
    }

    /**
     * Area getter
     *
     * @return
     */
    public double getArea() {
        return performance;
    }

    /**
     * Price getter
     *
     * @return
     */

    public double getPrice() {
        return price;
    }
}

