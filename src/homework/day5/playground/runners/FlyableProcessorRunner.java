package homework.day5.playground.runners;

import homework.day5.playground.essence.Flyable;
import homework.day5.playground.essence.craft.air.Aircraft;
import homework.day5.playground.essence.craft.air.Copter;
import homework.day5.playground.essence.craft.air.Plane;
import homework.day5.playground.essence.craft.air.Rocket;
import homework.day5.playground.essence.creatures.animal.insect.Fly;
import homework.day5.playground.essence.creatures.animal.insect.Insect;
import homework.day5.playground.essence.creatures.animal.insect.Mosquito;
import homework.day5.playground.processors.FlyableProcessor;

public class FlyableProcessorRunner {
     public static void main(String[] args) {
         FlyableProcessor processor = new FlyableProcessor();
         Flyable flyableCopter = new Copter(223, "Mi8 Flyable");
         Flyable flyablePlane = new Plane(3452, "Boeing 837 Flyable");
         Flyable flyableRocket = new Rocket(7623, "Super Heavy Flyable");
         Flyable flyableFly = new Fly(23, "Domestica Flyable");
         Flyable flyableMosquito = new Mosquito(12, "Vulgaris Flyable");
         Aircraft aircraftCopter = new Copter(223, "Mi8 Aircraft");
         Aircraft aircraftPlane = new Plane(3452, "Boeing 837 Aircraft");
         Aircraft aircraftRocket = new Rocket(7623, "Super Heavy Aircraft");
         Insect insectFly = new Fly(23, "Domestica Insect");
         Insect insectMosquito = new Mosquito(12, "Vulgaris Insect");
         Copter aCopter = new Copter(223, "Mi8 Copter");
         Plane aPlane = new Plane(3452, "Boeing 837 Plane");
         Rocket aRocket = new Rocket(7623, "Super Heavy Rocket");
         Fly aFly = new Fly(23, "Domestica Fly");
         Mosquito aMosquito = new Mosquito(12, "Vulgaris Mosquito");

         processor.runFlyable(flyableCopter);
         processor.runFlyable(flyablePlane);
         processor.runFlyable(flyableRocket);
         processor.runFlyable(flyableFly);
         processor.runFlyable(flyableMosquito);
         processor.runFlyable(aircraftCopter);
         processor.runFlyable(aircraftPlane);
         processor.runFlyable(aircraftRocket);
//         processor.runFlyable(insectFly); ожидается Flyable тип
//         processor.runFlyable(insectMosquito); ожидается Flyable тип
         processor.runFlyable(aCopter);
         processor.runFlyable(aPlane);
         processor.runFlyable(aRocket);
         processor.runFlyable(aFly);
         processor.runFlyable(aMosquito);


         processor.runFlyable(flyableCopter,"никуда");
         processor.runFlyable(aRocket,"повсюду");


     }
}
