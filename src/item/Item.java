package item;

public interface Item <T extends Item> {

    public float getProfit(T item);

}
