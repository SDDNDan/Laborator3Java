package portofolio;

import assetManager.SortByNameItems;
import assetManager.SortByValueAssets;
import assetManager.SortByValueAssetsDesc;
import assets.Asset;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GreedyAlgorithm implements Algorithm {

    String name = "GreedyAlgorithm";
    private int nrMaxim;

    @Override
    public String toString() {
        return "GreedyAlgorithm";

    }

    @Override
    public List<Asset> solve(List<Asset> assets,int maxValue) {
        int i;
        List<Asset> result= new ArrayList<>();
        Collections.sort(assets,new SortByValueAssetsDesc());

        i=0;
        while ( i<assets.size() &&maxValue-(int)assets.get(i).computeProfit()>=0 )
        {
            result.add(assets.get(i));
            maxValue=maxValue-(int)assets.get(i).computeProfit();
            i++;
        }

        return assets;
    }
}
