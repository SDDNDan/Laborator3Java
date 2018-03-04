package portofolio;

import assetManager.AssetManager;
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
    public void solve(List<Asset> assets) {
        int []taken = new int[100];
        for(int i=0;i<assets.size();i++)
            taken[i]=0;


        Random r = new Random();
        int randInt = r.nextInt(assets.size());
        System.out.println(randInt);
        System.out.println("AMA S DAS");
        System.out.println(assets);





    }
}
