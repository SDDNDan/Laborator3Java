package assetManager;

import assets.Asset;

import java.util.Comparator;

public class SortByValueAssets extends AssetManager implements Comparator<Asset> {
    @Override
    public int compare(Asset o1, Asset o2) {
        return (int)(o1.computeProfit()-o2.computeProfit());
    }
}
