package homework.day5.playground.essence.craft.hand;

import homework.day5.playground.essence.material.Pourable;

public class Bottle extends Container implements Storable {

    public Bottle(int mass, String name) {
        super(mass, name);
    }

    public void store(Pourable pourable, int amount) {
        pourable.spread(name);
        System.out.println(String.format("I am %s, my name is" + name + "and I received %s of %s", getClass().getSimpleName(), name, amount, pourable.getClass().getSimpleName()));
        if (amount > mass) {
            System.out.println("wooh-wooh-wooh-hh..");
        }
    }
}
