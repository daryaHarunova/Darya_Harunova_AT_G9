package homework.day5.playground.essence.creatures.plant;

import homework.day5.playground.essence.Matter;

public abstract class Plant extends Matter {
    protected double weight;
    String name;

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

    public Plant(double weight, int mass, double weight1, String name) {
        super(weight, mass);
        this.weight = weight1;
        this.name = name;
    }
}
