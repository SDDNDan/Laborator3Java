package jewel;
import item.Item;

public class Jewel extends Item{

    private  String name;
    private int price;


    public Jewel(String name, int area, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getArea() {
        System.out.println("This doesnt have a profit");
        return 0;
    }

    @Override
    public int getPrice() {
        return price;
    }
}

