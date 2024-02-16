package homework.day5.playground.essence.craft.field;

import homework.day5.playground.essence.Matter;
import homework.day5.playground.essence.craft.Rideable;
import homework.day5.playground.essence.craft.Transportable;

public abstract class Vehicle extends Matter implements Transportable, Rideable {
    protected String name;

    public Vehicle(int mass, String name) {
        super(mass);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void drive(String direction) {
        System.out.println(String.format("I am %s, my name is %s and I amd driving to %s", getClass().getSimpleName(), name, direction));
    }

    public int move(int pointA, int pointB) {
        System.out.println(String.format("I am %s, my name is %s and I am moving from point %d to point %d",getClass().getSimpleName(), name, pointA, pointB));
        return pointB - pointA;
    }
}
