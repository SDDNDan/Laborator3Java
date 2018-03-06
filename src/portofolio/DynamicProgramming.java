package portofolio;

import assetManager.SortByPriceAssets;
import assetManager.SortByValueAssets;
import assets.Asset;

import java.util.*;

public class DynamicProgramming implements Algorithm {

    String name = "DynamicProgramming";


    @Override
    public String toString() {
        return "DynamicProgramming";

    }

    @Override
    public List<Asset> solve(List<Asset> assets, int maxValue) {
        assets.sort(new SortByPriceAssets());
        List<List<Double>> matrix = new ArrayList<List<Double>>(0);

        for (int i = 0; i < assets.size(); i++) {
            List<Double> aux = new ArrayList<Double>();
            for (int j = 0; j <= maxValue; j++) {
                if (j == 0) {
                    aux.add(assets.get(i).getPriceAsset());
                } else {
                    aux.add(0.0);
                }
            }
            matrix.add(aux);

        }

        for (int i = 0; i < maxValue + 1; i++) {
            if (i > assets.get(0).getPriceAsset()) {
                matrix.get(0).set(i, assets.get(0).computeProfit());
            }
        }

        for (int i = 1; i < assets.size(); i++) {
            for (int j = 1; j <= maxValue; j++) {
                if (j > assets.get(i).getPriceAsset()) {
                    Double suma1 = assets.get(i).computeProfit();
                    suma1 = suma1 + matrix.get(i - 1).get(j - matrix.get(i).get(0).intValue());
                    if (suma1 > matrix.get(i - 1).get(j)) {
                        matrix.get(i).set(j, suma1);
                    } else {
                        matrix.get(i).set(j, matrix.get(i - 1).get(j));
                    }


                } else {
                    matrix.get(i).set(j, matrix.get(i - 1).get(j));
                }
            }
        }

        List<Asset> assetsResult = new ArrayList<>();
        int pozitionX = assets.size() - 1;
        int pozitionY = maxValue;
        while (pozitionY > 0 && pozitionX > 0) {
            if (matrix.get(pozitionX).get(pozitionY) == matrix.get(pozitionX - 1).get(pozitionY)) {
                System.out.println(matrix.get(pozitionX).get(pozitionY));
                pozitionX = pozitionX - 1;
            } else {
                assetsResult.add(assets.get(pozitionX));
                pozitionY = pozitionY - matrix.get(pozitionX).get(0).intValue() + 1;
                pozitionX = pozitionX - 1;
            }
        }
        int aux = 0;
        for (Asset i : assetsResult) {
            aux += i.getPriceAsset();
        }
        if (aux + assets.get(0).getPriceAsset() <= maxValue) {
            assetsResult.add(assets.get(0));
        }
        for (List<Double> i : matrix) {
            System.out.println(i);
        }

        assetsResult.sort(new SortByValueAssets());

        return assetsResult;
    }
}
