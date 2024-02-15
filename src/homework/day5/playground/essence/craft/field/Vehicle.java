package homework.day5.playground.essence.craft.field;

import homework.day5.playground.essence.Matter;

public abstract class Vehicle extends Matter {
    protected double weight;
    String name;

    public Vehicle(double weight, int mass) {
        super(weight, mass);
    }
}
