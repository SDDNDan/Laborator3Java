package portofolio;

import assets.Asset;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Portofolio {
    private Algorithm algorithm;
    private int maxValue;
    private ArrayList<Asset> assets;

    @Override
    public String toString() {
        List<Asset> assetList = algorithm.solve(this.assets);


        return "O sa returnam assetList sub forma de asseturi" +
                "1) Avem o metoda prin care luam numele asetului" +
                "2) Avem o metoda prin care luam profitul " +
                "3) Le afisam sub forma de seturi (2 cate 2)";

    }
    public Portofolio (Algorithm algorithm, int maxValue,ArrayList<Asset> assets){
        this.algorithm = algorithm;
        this.maxValue = maxValue;
        this.assets = assets;

    }





}
