package item;

import java.util.Comparator;

public abstract class Item{

    protected String name;

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public abstract double getArea();
    public abstract double getPrice();
}
