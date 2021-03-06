import assetManager.AssetManager;
import assetManager.SortByNameItems;
import assetManager.SortByValueAssets;
import assetManager.SortByValueItems;
import assets.Asset;
import buildings.Building;
import generator.ItemsBuild;
import jewel.Jewel;
import portofolio.DynamicProgramming;
import portofolio.GreedyAlgorithm;
import portofolio.Portofolio;
import portofolio.RandomAlgorithm;
import vehicle.Vehicle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {
    public static void main(String[] args) {


        Building h1 = new Building("House 1", 27, 9);
        Building h2 = new Building("House 2", 30, 12);
        Building h3 = new Building("House 3", 27, 10);
        Vehicle c1 = new Vehicle("Car 1", 9, 4);
        Vehicle c2 = new Vehicle("Aar 2", 8, 4);
        Jewel ring = new Jewel("ring", 3);
        AssetManager manager = new AssetManager();
        manager.add(h1, h2, h3);
        manager.add(c1, c2);
        manager.add(ring);


        System.out.println("Items sorted by the name: " + manager.getItems());


        manager.items.sort(new SortByNameItems());
        System.out.println(manager.items);
        manager.items.sort(new SortByValueItems());
        System.out.println(manager.items);
        manager.assets.sort(new SortByValueAssets());
        System.out.println(manager.assets);
        manager.getProfit();
        for (Asset i : manager.assets)
            System.out.print(i.computeProfit() + " ");
        System.out.print("\n");
        int maxValue = 20;
        Portofolio solution = manager.createPortofolio(new RandomAlgorithm(), maxValue);
        System.out.println("The best portofolio: " + solution);

        Portofolio solutionGreedy = manager.createPortofolio(new GreedyAlgorithm(), maxValue);
        System.out.println("The best portofolio: " + solutionGreedy);

        Portofolio solutionDynamic = manager.createPortofolio(new DynamicProgramming(), maxValue);
        System.out.println("The best portofolio: " + solutionDynamic);


        //Folosind Generator
        /*
        AssetManager manager2 = new AssetManager();
        List<Building> buildingList;
        ItemsBuild itemsBuild = new ItemsBuild();
        buildingList = itemsBuild.getBuilding(5);
        System.out.println(buildingList);
        for (Building i : buildingList) {
            manager2.add(i);
        }
        manager2.items.sort(new SortByNameItems());
        System.out.println(manager2.getItems());
        maxValue=50;
        Portofolio solution2 = manager2.createPortofolio(new DynamicProgramming(), maxValue);
        System.out.println("The best portofolio: " + solution2);
        */
    }
}
