package homework.day2.basetask;

public class TrainMethodsObjectsRunner {
    public static void main(String[] args) {
        TrainMethodsObjects train = new TrainMethodsObjects();
        train.processMouse(new Mouse("Люси", 5));
        train.processSouce(new Souce("Хайнц", "красный"));
        train.processBee(new Bee("male", 10));
        train.processObstacle(new Obstacle("очень все плохо", "critical"));
        train.processPineapple(new Pineapple("new", 20));
    }
}
