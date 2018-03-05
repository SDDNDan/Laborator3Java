package portofolio;

import assets.Asset;

import java.util.*;

public class RandomAlgorithm implements Algorithm {

    ArrayList<Asset> assets = new ArrayList<>();
    public RandomAlgorithm(){

    }

    @Override
    public String toString() {
        return "RandomAlgorithm";
    }

    @Override
    public List<Asset> solve(List<Asset> assets) {
        Random r = new Random();
        int randInt = r.nextInt(assets.size());

        System.out.println("MErge");
        System.out.println(assets.get(0).getNameAsset());

        return assets;
    }
}
