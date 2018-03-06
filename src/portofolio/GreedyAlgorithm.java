package portofolio;

import assetManager.SortByNameItems;
import assetManager.SortByValueAssets;
import assetManager.SortByValueAssetsDesc;
import assets.Asset;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Class designed to implement Greedy Algorithm
 */
public class GreedyAlgorithm implements Algorithm {

    /**
     * Members of greedy class
     */
    String name = "GreedyAlgorithm";
    private int nrMaxim;

    /**
     * String Overrider
     *
     * @return
     */
    @Override
    public String toString() {
        return "GreedyAlgorithm";

    }

    /**
     * The greedy solution of the problem
     *
     * @param assets
     * @param maxValue
     * @return
     */
    @Override
    public List<Asset> solve(List<Asset> assets, int maxValue) {
        int i;
        List<Asset> result = new ArrayList<>();
        Collections.sort(assets, new SortByValueAssetsDesc());

        i = 0;
        while (i < assets.size() && maxValue - (int) assets.get(i).getPriceAsset() >= 0) {
            result.add(assets.get(i));
            maxValue = maxValue - (int) assets.get(i).getPriceAsset();
            i++;
        } 

        return assets;
    }
}
