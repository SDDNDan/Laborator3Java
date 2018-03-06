package assetManager;

import item.Item;

import java.util.Comparator;

/**
 * Comparing class used to sort items by price ASC
 */
public class SortByValueItems extends AssetManager implements Comparator<Item> {

    public int compare(Item a, Item b) {
        if (a.getPrice() < b.getPrice())
            return -1;
        return 1;
    }
}
