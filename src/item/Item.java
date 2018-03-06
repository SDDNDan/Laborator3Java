package item;

import java.util.Comparator;

/**
 * SuperClass from which the objects of the problem are inherited
 */
public abstract class Item {

    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public abstract double getArea();

    public abstract double getPrice();
}
