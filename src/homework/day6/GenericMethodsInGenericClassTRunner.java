package homework.day6;

import homework.day5.playground.essence.craft.air.Copter;
import homework.day5.playground.essence.creatures.animal.Animal;
import homework.day5.playground.essence.creatures.animal.insect.Beetle;
import homework.day5.playground.essence.creatures.animal.insect.Fly;
import homework.day5.playground.essence.creatures.animal.insect.Insect;
import homework.day5.playground.essence.creatures.animal.insect.Mosquito;
import homework.day5.playground.essence.creatures.animal.vertebrata.Crocodile;
import homework.day5.playground.essence.creatures.animal.vertebrata.Pigeon;
import homework.day5.playground.essence.creatures.animal.vertebrata.Raven;
import homework.day5.playground.essence.creatures.plant.Plant;
import homework.day5.playground.essence.creatures.plant.flowers.Chamomile;
import homework.day5.playground.essence.creatures.plant.flowers.Flowers;
import homework.day5.playground.essence.creatures.plant.flowers.Maylily;
import homework.day5.playground.essence.creatures.plant.flowers.Rose;
import homework.day5.playground.essence.creatures.plant.vegetable.Carrot;
import homework.day5.playground.essence.creatures.plant.vegetable.Potato;
import homework.day5.playground.essence.creatures.plant.vegetable.Radish;
import homework.day5.playground.essence.creatures.plant.vegetable.Vegetable;
import homework.day5.playground.essence.material.Diesel;
import homework.day5.playground.essence.material.Petrol;
import homework.day5.playground.essence.material.Water;

public class GenericMethodsInGenericClassTRunner<T> {
    public static void main(String[] args) {
        GenericMethodsInGenericClassT<String> stringClass = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Integer> intClass = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Double> doubleClass = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Copter> copterClass = new GenericMethodsInGenericClassT<>();
// .......

        stringClass.genericMethodHalfGenArgs("123", "456");
        stringClass.genericMethodOneGenArg("23");
        System.out.println(stringClass.genericMethodTwoGenArgs("23", "456"));

        intClass.genericMethodHalfGenArgs(234, "456");
        intClass.genericMethodOneGenArg(34);
        System.out.println(intClass.genericMethodTwoGenArgs(4, 4));


        System.out.println(copterClass.genericMethodTwoGenArgs(new Copter(72,"оливер"), new Copter(74, "sbv")));


        GenericMethodsInGenericClassT<Animal> genericMethodsInGenericClassT1= new GenericMethodsInGenericClassT<>();
        genericMethodsInGenericClassT1.genericMethodOneGenArg(new Crocodile(100, "Crocodile"));
        System.out.println(genericMethodsInGenericClassT1.genericMethodTwoGenArgs(new Crocodile(100, "Crocodile two"), new Crocodile(100, "Crocodile two")));
        genericMethodsInGenericClassT1.genericMethodHalfGenArgs(new Crocodile(160, "Crocodile"), "args");
        System.out.println();

        GenericMethodsInGenericClassT<Beetle> genericMethodsInGenericClassT2= new GenericMethodsInGenericClassT<>();
        genericMethodsInGenericClassT2.genericMethodOneGenArg(new Beetle(5, "Beetle item"));
        System.out.println(genericMethodsInGenericClassT2.genericMethodTwoGenArgs(new Beetle(20, "Beetle first"), new Beetle(5, "Beetle second")));
        genericMethodsInGenericClassT2.genericMethodHalfGenArgs(new Beetle(6, "Beetle item3"), "Hi, beetle!");
        System.out.println();

        GenericMethodsInGenericClassT<Carrot> genericMethodsInGenericClassT3= new GenericMethodsInGenericClassT<>();
        genericMethodsInGenericClassT3.genericMethodOneGenArg(new Carrot(5, "Carrot"));
        System.out.println(genericMethodsInGenericClassT3.genericMethodTwoGenArgs(new Carrot(3, "Carrot first"), new Carrot(5, "Carrot")));
        genericMethodsInGenericClassT3.genericMethodHalfGenArgs(new Carrot(2, "Carrot item"), "Carrot");
        System.out.println();

        GenericMethodsInGenericClassT<Chamomile> genericMethodsInGenericClassT4= new GenericMethodsInGenericClassT<>();
        genericMethodsInGenericClassT4.genericMethodOneGenArg(new Chamomile(1, "Chamomile item"));
        System.out.println(genericMethodsInGenericClassT4.genericMethodTwoGenArgs(new Chamomile(1, "Chamomile"),new Chamomile(5, "Chamomile")));
        genericMethodsInGenericClassT4.genericMethodHalfGenArgs(new Chamomile(1, "Chamomile item3"), "This is a chamomile");
        System.out.println();

        GenericMethodsInGenericClassT<Crocodile> genericMethodsInGenericClassT5= new GenericMethodsInGenericClassT<>();
        genericMethodsInGenericClassT5.genericMethodOneGenArg(new Crocodile(15,"Crocodile"));
        System.out.println(genericMethodsInGenericClassT5.genericMethodTwoGenArgs(new Crocodile(102, "Crocodile"), new Crocodile(102, "Crocodil")));
        genericMethodsInGenericClassT5.genericMethodHalfGenArgs(new Crocodile(12, "Crocodile"), "b");
        System.out.println();

        GenericMethodsInGenericClassT<Flowers> genericMethodsInGenericClassT6= new GenericMethodsInGenericClassT<>();
        genericMethodsInGenericClassT6.genericMethodOneGenArg(new Maylily(5, "Maylily"));
        System.out.println(genericMethodsInGenericClassT6.genericMethodTwoGenArgs(new Maylily(1, "Maylily"),new Maylily(1, "Maylily")));
        genericMethodsInGenericClassT6.genericMethodHalfGenArgs(new Maylily(9, "Maylily"), "test");
        System.out.println();

        GenericMethodsInGenericClassT<Insect> genericMethodsInGenericClassT7= new GenericMethodsInGenericClassT<>();
        genericMethodsInGenericClassT7.genericMethodOneGenArg(new Fly(5, "Fly as insect"));
        System.out.println(genericMethodsInGenericClassT7.genericMethodTwoGenArgs(new Fly(1, "Fly"), new Fly(1, "Fly")));
        genericMethodsInGenericClassT7.genericMethodHalfGenArgs(new Fly(8, "Fly as insect3"), "Insect");
        System.out.println();

        GenericMethodsInGenericClassT<Maylily> genericMethodsInGenericClassT8= new GenericMethodsInGenericClassT<>();
        genericMethodsInGenericClassT8.genericMethodOneGenArg(new Maylily(1, "Maylily"));
        System.out.println(genericMethodsInGenericClassT8.genericMethodTwoGenArgs(new Maylily(1, "Maylily"), new Maylily(1, "Maylily")));
        genericMethodsInGenericClassT8.genericMethodHalfGenArgs(new Maylily(1, "Maylily"), "Method");
        System.out.println();

        GenericMethodsInGenericClassT<Mosquito> genericMethodsInGenericClassT9= new GenericMethodsInGenericClassT<>();
        genericMethodsInGenericClassT9.genericMethodOneGenArg(new Mosquito(1, "Mosquito"));
        System.out.println(genericMethodsInGenericClassT9.genericMethodTwoGenArgs(new Mosquito(1, "Mosquito"),new Mosquito(1, "Mosquito")));
        genericMethodsInGenericClassT9.genericMethodHalfGenArgs(new Mosquito(1, "Mosquito"), "test");
        System.out.println();

        GenericMethodsInGenericClassT<Pigeon> genericMethodsInGenericClassT10=new GenericMethodsInGenericClassT<>();
        genericMethodsInGenericClassT10.genericMethodOneGenArg(new Pigeon(25,"Pigeon"));
        System.out.println(genericMethodsInGenericClassT10.genericMethodTwoGenArgs(new Pigeon(25, "Pigeon"), new Pigeon(25, "Pigeon")));
        genericMethodsInGenericClassT10.genericMethodHalfGenArgs(new Pigeon(25,"Pigeon"), "Some pigeon");
        System.out.println();

        GenericMethodsInGenericClassT<Plant> genericMethodsInGenericClassT11=new GenericMethodsInGenericClassT<>();
        genericMethodsInGenericClassT11.genericMethodOneGenArg(new Rose(1, "Rose one"));
        System.out.println(genericMethodsInGenericClassT11.genericMethodTwoGenArgs(new Rose(1, "Rose"),new Rose(1, "Rose")));
        genericMethodsInGenericClassT11.genericMethodHalfGenArgs(new Rose(1, "Rose one"), "Test");
        System.out.println();

        GenericMethodsInGenericClassT<Potato> genericMethodsInGenericClassT12 = new GenericMethodsInGenericClassT<>();
        genericMethodsInGenericClassT12.genericMethodOneGenArg(new Potato(5, "Potato item"));
        System.out.println(genericMethodsInGenericClassT12.genericMethodTwoGenArgs(new Potato(8, "Potato item"), new Potato(9, "Potato")));
        genericMethodsInGenericClassT12.genericMethodHalfGenArgs(new Potato(6, "Potato item"), "mimimi");
        System.out.println();

        GenericMethodsInGenericClassT<Radish> genericMethodsInGenericClassT13 = new GenericMethodsInGenericClassT<>();
        genericMethodsInGenericClassT13.genericMethodOneGenArg(new Radish(1, "Radish"));
        System.out.println(genericMethodsInGenericClassT13.genericMethodTwoGenArgs(new Radish(5, "Radish"),new Radish(2, "Radish")));
        genericMethodsInGenericClassT13.genericMethodHalfGenArgs(new Radish(7, "Radish"), "Radish");
        System.out.println();

        GenericMethodsInGenericClassT<Raven> genericMethodsInGenericClassT14 = new GenericMethodsInGenericClassT<>();
        genericMethodsInGenericClassT14.genericMethodOneGenArg(new Raven(2, "Raven"));
        System.out.println(genericMethodsInGenericClassT14.genericMethodTwoGenArgs(new Raven(2, "Raven item"),new Raven(6, "Raven")));
        genericMethodsInGenericClassT14.genericMethodHalfGenArgs(new Raven(2, "Raven item"), "Hey, my friend!");
        System.out.println();

        GenericMethodsInGenericClassT<Rose> genericMethodsInGenericClassT15 = new GenericMethodsInGenericClassT<>();
        genericMethodsInGenericClassT15.genericMethodOneGenArg(new Rose(2, "Rose"));
        System.out.println(genericMethodsInGenericClassT15.genericMethodTwoGenArgs(new Rose(4, "Rose"), new Rose(1, "Rose")));
        genericMethodsInGenericClassT15.genericMethodHalfGenArgs(new Rose(3, "Rose two"), "This is a rose for you");
        System.out.println();

        GenericMethodsInGenericClassT<Vegetable> genericMethodsInGenericClassT16 = new GenericMethodsInGenericClassT<>();
        genericMethodsInGenericClassT16.genericMethodOneGenArg(new Potato(1, "Potato"));
        System.out.println(genericMethodsInGenericClassT16.genericMethodTwoGenArgs(new Potato(3, "Potato"),new Potato(2, "Potato")));
        genericMethodsInGenericClassT16.genericMethodHalfGenArgs(new Potato(1, "Potato"), "Test");
        System.out.println();

        GenericMethodsInGenericClassT<Diesel> genericMethodsInGenericClassT17 = new GenericMethodsInGenericClassT<>();
        genericMethodsInGenericClassT17.genericMethodOneGenArg(new Diesel(50));
        System.out.println(genericMethodsInGenericClassT17.genericMethodTwoGenArgs(new Diesel(30), new Diesel(20)));
        genericMethodsInGenericClassT17.genericMethodHalfGenArgs(new Diesel(30), "test");
        System.out.println();

        GenericMethodsInGenericClassT<Petrol> genericMethodsInGenericClassT18 = new GenericMethodsInGenericClassT<>();
        genericMethodsInGenericClassT18.genericMethodOneGenArg(new Petrol(50));
        System.out.println(genericMethodsInGenericClassT18.genericMethodTwoGenArgs(new Petrol(20), new Petrol(20)));
        genericMethodsInGenericClassT18.genericMethodHalfGenArgs(new Petrol(20), "Petrol");
        System.out.println();

        GenericMethodsInGenericClassT<Water> genericMethodsInGenericClassT19 = new GenericMethodsInGenericClassT<>();
        genericMethodsInGenericClassT19.genericMethodOneGenArg(new Water(70));
        System.out.println(genericMethodsInGenericClassT19.genericMethodTwoGenArgs(new Water(60),new Water(50)));
        genericMethodsInGenericClassT19.genericMethodHalfGenArgs(new Water(10), "water");
        System.out.println();

    }
}
