package portofolio;

import assets.Asset;
import assetManager.SortByNameItems;
import assetManager.SortByValueAssets;
import assetManager.SortByValueAssetsDesc;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Portofolio {
    private Algorithm algorithm;
    private int maxValue;
    private ArrayList<Asset> assets;

    @Override
    public String toString() {
        List<Asset> assetList = algorithm.solve(this.assets,this.getMaxValue());
        Collections.sort(assetList,new  SortByValueAssets());
        String names=new String();
        int i;
        names=" \n";
        for (i=0;i<assetList.size();i++) {
            names=names+i+'-';
            names=names+assetList.get(i).getNameAsset();
            names=names+" ";
            names=names+assetList.get(i).computeProfit();
            names=names+'\n';
        }
        return names;


    }
    public Portofolio (Algorithm algorithm, int maxValue,ArrayList<Asset> assets){
        this.algorithm = algorithm;
        this.maxValue = maxValue;
        this.assets = assets;

    }

    public int getMaxValue() {
        return maxValue;
    }
}
