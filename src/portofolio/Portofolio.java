package portofolio;

import assets.Asset;

import java.util.ArrayList;
import java.util.Random;

public class Portofolio {
    private Algorithm algorithm;
    private int maxValue;
    private ArrayList<Asset> assets;

    @Override
    public String toString() {
        algorithm.solve(this.assets);
        return "Using the algorithm : " + algorithm + " We have the solution : \n";


    }
    public Portofolio (Algorithm algorithm, int maxValue,ArrayList<Asset> assets){
        this.algorithm = algorithm;
        this.maxValue = maxValue;
        this.assets = assets;

    }

    public void solve()
    {

    }



}
