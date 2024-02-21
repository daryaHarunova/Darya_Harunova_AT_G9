package homework.day6;

import homework.day5.playground.essence.craft.air.Aircraft;
import homework.day5.playground.essence.craft.air.Copter;
import homework.day5.playground.essence.craft.air.Plane;
import homework.day5.playground.essence.craft.air.Rocket;
import homework.day5.playground.essence.craft.field.Car;
import homework.day5.playground.essence.craft.field.Moped;
import homework.day5.playground.essence.craft.field.Motorbike;
import homework.day5.playground.essence.craft.field.Vehicle;
import homework.day5.playground.essence.craft.hand.Bottle;
import homework.day5.playground.essence.craft.hand.Can;
import homework.day5.playground.essence.craft.hand.Container;
import homework.day5.playground.essence.craft.hand.Mug;
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

public class GenericMethodsInGenericClassTwoParamsRunner<T> {
    public static void main(String[] args) {
        GenericMethodsInGenericClassTwoParams<String, String> string1 = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<String, Integer> string2 = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<String, Double> string3 = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Integer, Integer> string4 = new GenericMethodsInGenericClassTwoParams<>();


        System.out.println(string1.genericMethodGenArgs("First Argument"));
        System.out.println(string1.genericMethodGenArgs("Argument one", "Argument two"));
        string1.genericMethodHalfGenArgs("First Argument", "string", "nextString");
        System.out.println();

        System.out.println(string2.genericMethodGenArgs("This is a string"));
        string2.genericMethodHalfGenArgs("Oliver", 500, "stg");
        string2.genericMethodHalfGenArgs("Dog", 50, "test");
        System.out.println();

        System.out.println(string3.genericMethodGenArgs("new test"));
        System.out.println(string3.genericMethodGenArgs("newValue", 0.5));
        string3.genericMethodHalfGenArgs("ailend", 99.99, "newValue");
        string3.genericMethodHalfGenArgs("Arg1", 100.9, "newValue");
        System.out.println();

        System.out.println(string4.genericMethodGenArgs(50));
        System.out.println(string4.genericMethodGenArgs(5, 500));
        string4.genericMethodHalfGenArgs(5000, 55, "end");
        System.out.println();
    }
}
