package assetManager;

import assets.Asset;
import item.Item;
import jewel.Jewel;
import portofolio.Algorithm;
import portofolio.Portofolio;

import javax.sound.sampled.Port;


import java.lang.reflect.Array;
import java.util.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Class designed to create the class portofolio of the problem.
 */
public class AssetManager {
    /**
     * Members of the class
     */
    public ArrayList<Item> items;
    public ArrayList<Asset> assets;

    public double numberOfAssets;
    public double profit;

    /**
     * NULL Constructor of the class
     */
    public AssetManager() {
        this.items = new ArrayList<>();
        this.assets = new ArrayList<>();
    }

    /**
     * Contructor of the class with parameters
     *
     * @param algorithm
     * @param maxValue
     * @return
     */
    public Portofolio createPortofolio(Algorithm algorithm, int maxValue) {
        Portofolio portofolio = new Portofolio(algorithm, maxValue, assets);


        return portofolio;
    }

    /**
     * Setter
     *
     * @param numberOfAssets
     */
    public void setNumberOfAssets(int numberOfAssets) {
        this.numberOfAssets = assets.size();
    }

    /**
     * Getter of profit
     *
     * @return
     */
    public double getProfit() {
        return setProfit();
    }

    /**
     * Setter of profit
     *
     * @return
     */
    public double setProfit() {
        double theProfit = 0;
        for (Asset i : assets) {
            theProfit = theProfit + i.computeProfit();

        }
        theProfit = theProfit - (1 / numberOfAssets);
        return theProfit;
    }

    /**
     * Method used to add items(Except jewels) which have profit and store them in the assets array
     *
     * @param items
     */
    public void add(Item... items) {
        for (Item i : items) {
            this.items.add(i);
            if (!(i instanceof Jewel)) {
                assets.add((Asset) i);
                numberOfAssets = numberOfAssets + 0.1;
            }
        }
    }

    /**
     * Method which return the items list sorted ASC
     *
     * @return
     */
    public ArrayList<Item> getItems() {
        Collections.sort(this.items, new SortByNameItems());
        return items;
    }
}
