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
    public List<Asset> solve(List<Asset> assets,int maxValue) {
        List<Asset> result=new ArrayList<>();
        Random r = new Random();
        int []check=new int[assets.size()];
        int test=0;
        int i=assets.size()-1;
        int randInt = r.nextInt(i);
        while (i>=0 && randInt>=0  && maxValue-assets.get(randInt).computeProfit()>=0 )
        {
            if (check[randInt]==0) {
                maxValue = maxValue - (int) assets.get(randInt).computeProfit();
                result.add(assets.get(randInt));
                i = i - 1;

                if (i == 0) break;
                randInt = r.nextInt(assets.size());
                test = test + 1;
                check[randInt]=1;
            }
            else randInt = r.nextInt(assets.size());
        }


        return result;
    }
}
