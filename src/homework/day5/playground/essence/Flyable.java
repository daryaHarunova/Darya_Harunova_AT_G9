package homework.day5.playground.essence;

public interface Flyable {
    default void fly(String direction){
        System.out.println(String.format("I am %s, my name is %s and I amd flying to %s", getClass(),getClass().getName(), direction));
    }
}
