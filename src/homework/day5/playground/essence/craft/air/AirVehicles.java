package homework.day5.playground.essence.craft.air;

import homework.day5.playground.essence.Matter;

public abstract class AirVehicles extends Matter {
    protected String name;

    public AirVehicles(double weight, int mass, String name) {
        super(weight, mass);
        this.name = name;
    }
}
