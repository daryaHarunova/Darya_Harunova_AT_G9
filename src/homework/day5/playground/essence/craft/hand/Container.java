package homework.day5.playground.essence.craft.hand;

import homework.day5.playground.essence.Matter;

public abstract class Container extends Matter {
    protected double weight;
    String name;

    public Container(double weight, int mass) {
        super(weight, mass);
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
