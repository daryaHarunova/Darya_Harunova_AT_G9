package homework.day5.playground.essence.craft.hand;

import homework.day5.playground.essence.Matter;

public abstract class Container extends Matter {
    protected String name;

    public Container(double weight, int mass, String name) {
        super(weight, mass);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
