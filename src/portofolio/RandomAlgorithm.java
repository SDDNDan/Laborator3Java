package portofolio;

import assets.Asset;

import java.util.*;

/**
 * Class designed to solve the portofolio problem with a random algorithm
 */
public class RandomAlgorithm implements Algorithm {

    List<Asset> assets = new ArrayList<>();

    /**
     * null constructor
     */
    public RandomAlgorithm() {

    }

    /**
     * Overrider of toString
     *
     * @return
     */
    @Override
    public String toString() {
        return "RandomAlgorithm";
    }

    /**
     * Actually implementation of the random algorithm
     *
     * @param assets
     * @param maxValue
     * @return
     */
    @Override
    public List<Asset> solve(List<Asset> assets, int maxValue) {
        List<Asset> result = new ArrayList<>();
        Random r = new Random();
        int[] check = new int[assets.size()];
        int test = 0;
        int i = assets.size() - 1;
        int randInt = r.nextInt(i);
        while (i >= 0 && randInt >= 0 && maxValue - assets.get(randInt).getPriceAsset() >= 0) {
            if (check[randInt] == 0) {
                maxValue = maxValue - (int) assets.get(randInt).getPriceAsset();
                result.add(assets.get(randInt));
                check[randInt] = 1;
                i = i - 1;

                if (i == 0) break;
                randInt = r.nextInt(assets.size());
                test = test + 1;

            } else randInt = r.nextInt(assets.size());
        }


        return result;
    }
}
