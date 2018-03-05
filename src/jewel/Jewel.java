package jewel;
import item.Item;

public class Jewel extends Item{

    private int price;


    public Jewel(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double getArea() {
        System.out.println("This doesnt have a profit");
        return 0;
    }

    @Override
    public String toString() {
        return this.getName();
    }

    @Override
    public double getPrice() {
        return price;
    }
}

