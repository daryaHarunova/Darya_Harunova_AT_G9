package homework.day5.playground.processors;

import homework.day5.playground.essence.craft.Transportable;

import static homework.day5.playground.utils.CoordinatesGenerator.generateCoordinate;

public class TransportableProcessor {
    public void runTransportable(Transportable transportable, int pointA, int pointB) {
        int diff = transportable.move(pointA, pointB);
        System.out.println((String.format("Transportable %s was moved to" + diff + "points", transportable.getClass().getName())));
    }

    public void runTransportable(Transportable transportable) {
        int diff = transportable.move(generateCoordinate(), generateCoordinate());
        System.out.println((String.format("Transportable %s was moved to" + diff + "points", transportable.getClass().getName())));
    }

}
