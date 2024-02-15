package homework.day5.playground.essence.creatures.animal.insect;

import homework.day5.playground.essence.Flyable;

public class Fly extends Insect implements Flyable {
    public Fly(double weight, int mass, String name) {
        super(weight, mass, name);
    }
}
