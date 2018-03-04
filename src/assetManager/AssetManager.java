package assetManager;

import assets.Asset;
import item.Item;
import jewel.Jewel;
import portofolio.Algorithm;
import portofolio.Portofolio;

import javax.sound.sampled.Port;
import java.util.ArrayList;
import java.util.List;

public class AssetManager {
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

    public List<Item> getItems() {
        List<Item> items = new ArrayList<>();
        List<Item> aux = new ArrayList<>();
        aux = this.items;
        boolean smallest;
        boolean added = true;
        int i = 0, j;
        while (!aux.isEmpty()) {
            if (added) {
                i = 0;
                added = false;
            }
            smallest = true;
            for (j = i + 1; j < aux.size(); j++)
                if (aux.get(i).getName().compareTo(aux.get(j).getName()) > 0) smallest = false;
            if (smallest) {

                items.add(aux.get(i));
                aux.remove(i);
                smallest = false;
                added = true;
            } else {
                i = i + 1;

            }
        }
        return items;
    }


    public String getAssets() {
        int i = 0, numberOfAssets = 0;
        float[] result = new float[100];
        int[] pozitions = new int[100];
        for (i = 0; i < this.assets.size(); i++) {
            result[numberOfAssets] = assets.get(i).computeProfit();
            pozitions[i] = i;
            numberOfAssets++;
        }
        float aux = 0;

        int j;
        String stringResult = new String();
        for (i = 0; i < numberOfAssets; i++)
            for (j = 0; j < numberOfAssets; j++)
                if (result[i] < result[j]) {
                    pozitions[i] = j;
                    pozitions[j] = i;
                    aux = result[i];
                    result[i] = result[j];
                    result[j] = aux;

                }
        for (i = 0; i < numberOfAssets; i++)
            stringResult = stringResult + String.valueOf(result[i]) + " " + assets.get(pozitions[i]) + '\n';
        return stringResult;


    }
}
