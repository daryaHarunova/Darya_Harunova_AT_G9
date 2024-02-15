package homework.day5.playground.essence.creatures.plant.flowers;

import homework.day5.playground.essence.creatures.plant.Plant;

public abstract class Flowers extends Plant {
    protected double weight;
    String name;

    public Flowers(double weight, int mass, double weight1, String name) {
        super(weight, mass);
        this.weight = weight1;
        this.name = name;
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
