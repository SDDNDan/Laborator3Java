package assetManager;

import assets.Asset;

import java.util.Comparator;

/**
 * Comparing class used to sort items by assets DESC
 */
public class SortByValueAssetsDesc extends AssetManager implements Comparator<Asset> {

    public int compare(Asset o1, Asset o2) {
        if (o1.computeProfit() < o2.computeProfit())
            return 1;
        return -1;

    }
}
