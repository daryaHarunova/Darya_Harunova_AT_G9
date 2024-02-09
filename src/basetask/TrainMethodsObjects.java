package basetask;

public class TrainMethodsObjects {
    public void processMouse(Mouse mouse) {
        System.out.println("Имя мыши: " + mouse.getName());
        System.out.println("Возраст мыши: " + mouse.getAge());
        mouse.printMouseDetails();
    }

    public void processSouce(Souce souce) {
        System.out.println("Цвет: " + souce.getColor());
        System.out.println("Имя: " + souce.getName());
        souce.printSouceDetails();
    }

    public void processBee(Bee bee) {
        System.out.println("Пол: " + bee.getGender());
        System.out.println("Вес: " + bee.getWeight());
        bee.printBeeDetails();
    }

    public void processObstacle(Obstacle obstacle) {
        System.out.println("Описание: " + obstacle.getDescription());
        System.out.println("Важность: " + obstacle.getSeverity());
        obstacle.printObstacleDetails();
    }

    public void processPineapple (Pineapple pineapple) {
            System.out.println("Сорт: " + pineapple.getGrade());
            System.out.println("Теплоемкость : " + pineapple.getHeatCapacity());
            pineapple.printPineappleDetails();

        }
}
