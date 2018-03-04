package assetManager;

import item.Item;
import vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class AssetManager {
    List<Item> items ;

    public AssetManager() {
            this.items=new ArrayList<>();
    }
    public void add (Item... Items)
    {

        for (Item i : Items)
                this.items.add(i);
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


        }
