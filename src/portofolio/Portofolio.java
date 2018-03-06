package portofolio;

import assets.Asset;
import assetManager.SortByNameItems;
import assetManager.SortByValueAssets;
import assetManager.SortByValueAssetsDesc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Class designed to serve as a storing place for the inputs of the problem.
 * This class will be used in calling the algorithms that will eventually solve the problem.
 * So in stores the inputs of the problems then return the outputs.
 */
public class Portofolio {
    /**
     * Members of the class
     */
    private Algorithm algorithm;
    private int maxValue;
    private ArrayList<Asset> assets;

    /**
     * Overrider of the toString
     *
     * @return
     */
    @Override
    public String toString() {
        List<Asset> assetList = algorithm.solve(this.assets, this.getMaxValue());
        assetList.sort(new SortByValueAssets());
        String names;
        int i;
        names = " \n";
        for (i = 0; i < assetList.size(); i++) {
            names = names + i + '-';
            names = names + assetList.get(i).getNameAsset();
            names = names + " ";
            names = names + assetList.get(i).computeProfit();
            names = names + '\n';
        }
        return names;


    }

    /**
     * Constructor of the class
     *
     * @param algorithm
     * @param maxValue
     * @param assets
     */
    public Portofolio(Algorithm algorithm, int maxValue, ArrayList<Asset> assets) {
        this.algorithm = algorithm;
        this.maxValue = maxValue;
        this.assets = assets;

    }

    /**
     * Getter of the max value
     *
     * @return
     */

    public int getMaxValue() {
        return maxValue;
    }
}
