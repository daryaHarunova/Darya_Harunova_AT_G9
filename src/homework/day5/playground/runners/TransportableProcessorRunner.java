package homework.day5.playground.runners;

import homework.day5.playground.essence.Flyable;
import homework.day5.playground.essence.craft.Rideable;
import homework.day5.playground.essence.craft.Transportable;
import homework.day5.playground.essence.craft.air.Aircraft;
import homework.day5.playground.essence.craft.air.Copter;
import homework.day5.playground.essence.craft.air.Plane;
import homework.day5.playground.essence.craft.air.Rocket;
import homework.day5.playground.essence.craft.field.Car;
import homework.day5.playground.essence.craft.field.Moped;
import homework.day5.playground.essence.craft.field.Motorbike;
import homework.day5.playground.essence.craft.field.Vehicle;
import homework.day5.playground.processors.TransportableProcessor;

public class TransportableProcessorRunner {
    public static void main(String[] args) {
        TransportableProcessor processor = new TransportableProcessor();
        Transportable transportableCopter = new Copter(223, "AW109 Transportable");
        Transportable transportablePlane = new Plane(3452, "Airbus a380 Transportable");
        Transportable transportableRocket = new Rocket(7623, "Soyuz-FG Transportable");
        Transportable transportableCar = new Car(23, "Tesla X Transportable");
        Transportable transportableMoped = new Moped(12, "Honda EM1 Transportable");
        Transportable transportableMotorbike = new Motorbike(12, "Suzuki GSX-R1000 Transportable");
        Aircraft aircraftCopter = new Copter(223, "AW109 Aircraft");
        Aircraft aircraftPlane = new Plane(3452, "Airbus a380 Aircraft");
        Aircraft aircraftRocket = new Rocket(7623, "Soyuz-FG Aircraft");
        Vehicle vehicleCar = new Car(23, "Tesla X Vehicle");
        Vehicle vehicleMoped = new Moped(12, "Honda EM1 Vehicle");
        Vehicle vehicleMotorbike = new Motorbike(12, "Suzuki GSX-R1000 Vehicle");
        Flyable flyableCopter = new Copter(223, "AW109 Flyable");
        Flyable flyablePlane = new Plane(3452, "Airbus a380 Flyable");
        Flyable flyableRocket = new Rocket(7623, "Soyuz-FG Flyable");
        Rideable rideableCar = new Car(23, "Tesla X Rideable");
        Rideable rideableMoped = new Moped(12, "Honda EM1 Rideable");
        Rideable rideableMotorbike = new Motorbike(12, "Suzuki GSX-R1000 Rideable");
        Copter aCopter = new Copter(223, "AW109 Copter");
        Plane aPlane = new Plane(3452, "Airbus a380 Plane");
        Rocket aRocket = new Rocket(7623, "Soyuz-FG Rocket");
        Car aCar = new Car(23, "Tesla X Car");
        Moped aMoped = new Moped(12, "Honda EM1 Moped");
        Motorbike aMotorbike = new Motorbike(12, "Suzuki GSX-R1000 Motorbike");

        processor.runTransportable(transportableCopter);
        processor.runTransportable(transportablePlane);
        processor.runTransportable(transportableRocket);
        processor.runTransportable(transportableCar);
        processor.runTransportable(transportableMoped);
        processor.runTransportable(transportableMotorbike);
        processor.runTransportable(aircraftCopter);
        processor.runTransportable(aircraftPlane);
        processor.runTransportable(aircraftRocket);
        processor.runTransportable(vehicleCar);
        processor.runTransportable(vehicleMoped);
        processor.runTransportable(vehicleMotorbike);
//        processor.runTransportable(flyableCopter); ожидается Flyable тип
//        processor.runTransportable(flyablePlane); ожидается Flyable тип
//        processor.runTransportable(flyableRocket); ожидается Flyable тип
        processor.runTransportable((Transportable) rideableCar);
//        processor.runTransportable(rideableMoped); ожидается Flyable тип
//        processor.runTransportable(rideableMotorbike); ожидается Flyable тип
        processor.runTransportable(aCopter);
        processor.runTransportable(aPlane);
        processor.runTransportable(aCar);
        processor.runTransportable(aMoped);
        processor.runTransportable(aMotorbike);


        processor.runTransportable(aPlane, 23, 242);
        processor.runTransportable(vehicleCar, 93, 7);


    }
}
