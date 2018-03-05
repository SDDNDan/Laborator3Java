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

public class AssetManager{
    public ArrayList<Item> items;
    public ArrayList<Asset> assets;

    public double numberOfAssets;
    public double profit;

    public AssetManager() {
        this.items = new ArrayList<>();
        this.assets = new ArrayList<>();
    }

    public Portofolio createPortofolio(Algorithm algorithm, int maxValue) {
        Portofolio portofolio = new Portofolio(algorithm, maxValue,assets);


        return portofolio;
    }

    public void setNumberOfAssets(int numberOfAssets) {
        this.numberOfAssets = assets.size();
    }

    public double getProfit() {
        return setProfit();
    }

    public double setProfit() {
        double theProfit = 0;
        for (Asset i : assets) {
            theProfit = theProfit + i.computeProfit();

        }
        theProfit = theProfit - (1 / numberOfAssets);
        return theProfit;
    }


    public void add(Item... items) {
        for (Item i : items) {
            this.items.add(i);
            if (!(i instanceof Jewel)) {
                assets.add((Asset) i);
                numberOfAssets = numberOfAssets + 0.1;
            }
        }
    }





}
