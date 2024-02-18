package homework.day5.playground.runners;

import homework.day5.playground.essence.Matter;
import homework.day5.playground.essence.craft.hand.Bottle;
import homework.day5.playground.essence.craft.hand.Can;
import homework.day5.playground.essence.craft.hand.Container;
import homework.day5.playground.essence.craft.hand.Storable;
import homework.day5.playground.essence.material.*;
import homework.day5.playground.processors.StorableProcessor;

public class StorableProcessorRunner {
     public static void main(String[] args) {
         StorableProcessor processor = new StorableProcessor();

         Bottle bottle = new Bottle(23, "Glass");
         Storable storableBottle = new Bottle(4, "Plastic");
         Container containerBottle = new Bottle(78, "Metal");
         Matter matterBottle = new Bottle(33, "Blue");
         Can can = new Can(23, "Wooden");
         Storable storableCan = new Can(82, "Small");
         Container containerCan = new Can(54, "Big");
         Matter matterCan = new Can(8, "Old");


         Petrol petrol = new Petrol(11);
         Pourable pourablePetrol = new Petrol(65);
         Pourable pourableDiesel = new Diesel(3);
         Powerable powerableDiesel = new Diesel(87);
         Matter matterPetrol = new Petrol(2);
         Water water = new Water(34);
         Pourable pourableWater = new Water(37);

         processor.runStorable(bottle, petrol);
         processor.runStorable(bottle,pourablePetrol);
         processor.runStorable(bottle, (Pourable) powerableDiesel);
         processor.runStorable(bottle, pourableDiesel);
         processor.runStorable(bottle, (Pourable) matterPetrol);
         processor.runStorable(bottle, water);
         processor.runStorable(bottle, pourableWater);

         processor.runStorable(storableBottle, petrol);
         processor.runStorable(storableBottle,pourablePetrol);
         processor.runStorable(storableBottle, (Pourable) powerableDiesel);
         processor.runStorable(storableBottle, pourableDiesel);
         processor.runStorable(storableBottle, (Pourable) matterPetrol);
         processor.runStorable(storableBottle, water);
         processor.runStorable(storableBottle, pourableWater);

         processor.runStorable((Storable)containerBottle, petrol);
         processor.runStorable((Storable)containerBottle,pourablePetrol);
         processor.runStorable((Storable)containerBottle, (Pourable) powerableDiesel);
         processor.runStorable((Storable)containerBottle, pourableDiesel);
         processor.runStorable((Storable)containerBottle, (Pourable) matterPetrol);
         processor.runStorable((Storable)containerBottle, water);
         processor.runStorable((Storable)containerBottle, pourableWater);


     }
}
