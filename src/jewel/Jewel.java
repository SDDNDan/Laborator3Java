package jewel;

import item.Item;

/**
 * Object of the problem, it is a of type Item and implements the interface Assets
 */
public class Jewel extends Item {

    private int price;

    /**
     * Constructor
     *
     * @param name
     * @param price
     */
    public Jewel(String name, int price) {
        this.name = name;
        this.price = price;
    }

    /**
     * Getter
     *
     * @return
     */
    @Override
    public double getArea() {
        System.out.println("This doesnt have a profit");
        return 0;
    }

    /**
     * Overrider of String
     *
     * @return
     */
    @Override
    public String toString() {
        return this.getName();
    }

    /**
     * Price Getter
     *
     * @return
     */
    @Override
    public double getPrice() {
        return price;
    }
}

