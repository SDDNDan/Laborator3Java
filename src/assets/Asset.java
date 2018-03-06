package assets;

/**
 * Interface used by the objects of the problem in calculating the profits and the risk.
 * Most of the algorithms in the problems will use arrays of assets objects
 */
public interface Asset {

    public double getPriceAsset();

    public String getNameAsset();

    public double computeProfit();

    public double calculateRisk(int numberOfThatItem);


}
