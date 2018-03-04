package assetManager;

import item.Item;

import java.util.Comparator;

public class SortByValueItems extends AssetManager implements Comparator<Item> {

    public int compare(Item a, Item b)
    {
        return a.getPrice() - b.getPrice();
    }
}
