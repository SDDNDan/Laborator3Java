package assets;

public interface Asset {

    public double getPriceAsset();
    public String getNameAsset();
    public double computeProfit();
    public double calculateRisk(int numberOfThatItem);


}
