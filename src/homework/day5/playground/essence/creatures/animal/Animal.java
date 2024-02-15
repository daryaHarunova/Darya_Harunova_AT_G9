package homework.day5.playground.essence.creatures.animal;

import homework.day5.playground.essence.Matter;
import homework.day5.playground.essence.creatures.plant.Plant;

public abstract class Animal extends Matter {
    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal(double weight, int mass, String name) {
        super(weight, mass);
        this.name = name;
    }

    public void eat(Plant food) {
        System.out.println(String.format("I am %s and I am eating %s", name, food.getName()));
    }
}
