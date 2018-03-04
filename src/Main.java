import assetManager.AssetManager;
import assetManager.SortByNameItems;
import assetManager.SortByValueAssets;
import assetManager.SortByValueItems;
import buildings.Building;
import jewel.Jewel;
import portofolio.Portofolio;
import portofolio.RandomAlgorithm;
import vehicle.Vehicle;

import java.util.Collections;


public class Main {
    public static void main(String[] args) {


        Building h1 = new Building("House 1", 27, 9);
        Building h2 = new Building("House 2", 27, 11);
        Building h3 = new Building("House 3", 27, 10);
        Vehicle c1 = new Vehicle("Car 1", 8, 4);
        Vehicle c2 = new Vehicle("Aar 2", 8, 4);
        Jewel ring= new Jewel("ring",3);
        AssetManager manager = new AssetManager();
        manager.add(h1, h2, h3);
        manager.add(c1, c2);
        manager.add(ring);

        Collections.sort(manager.items, new SortByNameItems());
        System.out.println(manager.items);
        Collections.sort(manager.items, new SortByValueItems());
        System.out.println(manager.items);
        Collections.sort(manager.assets, new SortByValueAssets());
        System.out.println(manager.assets);

        int maxValue = 20;
        Portofolio solution = manager.createPortofolio(new RandomAlgorithm(), maxValue);
        System.out.println("The best portofolio: " + solution);

    }
}
