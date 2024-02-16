package homework.day5.playground.essence.craft.air;

import homework.day5.playground.essence.Flyable;
import homework.day5.playground.essence.Matter;
import homework.day5.playground.essence.craft.Transportable;

public abstract class Aircraft extends Matter implements Flyable, Transportable {
    protected String name;

    public Aircraft(int mass, String name) {
        super(mass);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int move(int pointA, int pointB) {
        System.out.println(String.format("I am %s, my name is %s and I am moving from point %d to point %d",getClass().getSimpleName(), name, pointA, pointB));
        return pointB - pointA;
    }

    public void fly(String direction){
        System.out.println(String.format("I am %s, my name is %s and I amd flying to %s", getClass().getSimpleName(), name, direction));
    }
}
