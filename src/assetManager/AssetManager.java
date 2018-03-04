package assetManager;

import assets.Assets;
import item.Item;
import jewel.Jewel;
import vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class AssetManager {
    List<Item> items ;
    List<Assets> assets;
    public AssetManager() {
            this.items=new ArrayList<>();
            this.assets=new ArrayList<>();
    }
    public void add (Item... Items)
    {

        for (Item i : Items) {
            this.items.add(i);
            if (i instanceof Jewel==false) assets.add((Assets)i);
        }
    }
    public List<Item> getItems()
    {
        List<Item> items = new ArrayList<>();
        List<Item> aux   = new ArrayList<>();
        aux=this.items;
        boolean smallest;
        boolean added=true;
        int i=0,j;
        while (aux.isEmpty()==false) {
            if (added==true) {
                i=0;
                added=false;
            }
            smallest = true;
            for (j = i+1; j < aux.size(); j++)
                if (aux.get(i).getName().compareTo(aux.get(j).getName())>0) smallest = false;
            if (smallest==true) 
            {

                items.add(aux.get(i));
                aux.remove(i);
                smallest=false;
                added=true;
            }
            else 
            {
                i=i+1;
                
            }
        }
        return items;
    }


    public String getAssets() {
        int i=0,numberOfAssets=0;
        float []result = new float[100];
        for (i=0;i<this.assets.size();i++){
            result[numberOfAssets]=assets.get(i).computeProfit();
            numberOfAssets++;
        }
        float aux=0;
        int j;
        String stringResult = new String();
        for (i=0;i<numberOfAssets;i++)
            for (j=0;j<numberOfAssets;j++)
                    if (result[i]<result[j])
                    {
                        aux=result[i];
                        result[i]=result[j];
                        result[j]=aux;
                    }
        for (i=0;i<numberOfAssets;i++)
               stringResult=stringResult+ String.valueOf(result[i]) + ' ';
        return stringResult;
    }
}
