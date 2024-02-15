package homework.day5.playground.essence.creatures.animal.vertebrata;

import homework.day5.playground.essence.creatures.animal.Animal;
import homework.day5.playground.essence.creatures.animal.insect.Insect;

public abstract class Vertebrata extends Animal {

    public Vertebrata(double weight, int mass, String name) {
        super(weight, mass, name);
    }
    public void eat(Insect food) {
        System.out.println(String.format("I am %s and I am eating %s", name, food.getName()));
    }
}
