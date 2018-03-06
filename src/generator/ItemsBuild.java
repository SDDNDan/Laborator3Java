package generator;

import buildings.Building;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ItemsBuild {

    public List<Building> getBuilding(int n)
    {
       int a =1;
        List<Building> buildings = new ArrayList<>();
        for(int i=0;i<n;i++){
            Random rand = new Random();
            Building building = new Building("House "+String.valueOf(a).toString(),rand.nextInt(100) + 50,rand.nextInt(50) + 1);
            buildings.add(building);
            a++;

        }
        return buildings;
    }
}
