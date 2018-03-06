package assetManager;

import assets.Asset;

import java.util.Comparator;

public class SortByPriceAssets extends AssetManager implements Comparator<Asset> {

    public int compare(Asset o1, Asset o2) {
        if(o1.getPriceAsset() < o2.getPriceAsset())
            return -1;
        return 1;
    }
}