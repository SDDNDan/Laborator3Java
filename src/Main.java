import assetManager.AssetManager;
import buildings.Building;
import jewel.Jewel;
import portofolio.GreedyAlgorithm;
import portofolio.Portofolio;
import portofolio.RandomAlgorithm;
import vehicle.Vehicle;


public class Main {
    public static void main(String[] args) {


        Building h1 = new Building("House 1", 27, 9);
        Building h2 = new Building("House 2", 27, 9);
        Building h3 = new Building("House 3", 27, 9);
        Vehicle c1 = new Vehicle("Car 1", 8, 4);
        Vehicle c2 = new Vehicle("Car 2", 8, 4);
        Jewel ring= new Jewel("ring",3);
        AssetManager manager = new AssetManager();
        manager.add(h1, h2, h3);
        manager.add(c1, c2);
        manager.add(ring);

        System.out.println("Items sorted by the name: " + manager.getItems());
        System.out.println("Asset sorted by the value : " + manager.getAssets());
        System.out.println("The profit is " + manager.getProfit());

        int maxValue = 20;
        Portofolio solution = manager.createPortofolio(new RandomAlgorithm(), maxValue);
        System.out.println("The best portofolio: " + solution);

    }
}
