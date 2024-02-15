package homework.day5.playground.essence.craft.field;

import homework.day5.playground.essence.Matter;

public abstract class Vehicle extends Matter {
    protected String name;

    public Vehicle(double weight, int mass, String name) {
        super(weight, mass);
        this.name = name;
    }
}
