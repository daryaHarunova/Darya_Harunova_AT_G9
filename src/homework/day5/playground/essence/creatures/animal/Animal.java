package homework.day5.playground.essence.creatures.animal;

import homework.day5.playground.essence.Matter;
import homework.day5.playground.essence.creatures.plant.Plant;

public abstract class Animal extends Matter {
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

    public Animal(double weight, int mass, double weight1, String name) {
        super(weight, mass);
        this.weight = weight1;
        this.name = name;
    }

    public void eat(Plant food) {
        System.out.printf("I am %s and I am eating %s.%n", name, food.getName());

    }
}
