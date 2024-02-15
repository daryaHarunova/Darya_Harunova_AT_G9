package homework.day5.playground.essence.craft.air;

import homework.day5.playground.essence.Flyable;
import homework.day5.playground.essence.Matter;
import homework.day5.playground.essence.craft.Transportable;

public abstract class AirVehicles extends Matter implements Flyable, Transportable {
    protected String name;

    public AirVehicles(double weight, int mass, String name) {
        super(weight, mass);
        this.name = name;
    }
}
