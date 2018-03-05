package assetManager;

import item.Item;

import java.util.Comparator;

public class SortByNameItems extends AssetManager implements Comparator<Item>{

    public int compare(Item o1, Item o2) {
        Item x = (Item) o1;
        Item y = (Item) o2;
        return x.getName().compareTo(y.getName());
    }
}
