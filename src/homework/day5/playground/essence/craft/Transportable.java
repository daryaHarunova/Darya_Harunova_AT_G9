package homework.day5.playground.essence.craft;

public interface Transportable {
    public default int move(int pointA, int pointB) {
        System.out.println(String.format("I am %s, my name is %s and I am moving from point %d to point %d", getClass(), getClass().getName(), pointA, pointB));
        return pointB - pointA;
    }
}

