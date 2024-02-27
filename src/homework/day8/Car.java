package homework.day8;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Car {
    public static void main(String[] args) throws IOException {
        List<String> cars = new ArrayList<>();
        BufferedWriter out = new BufferedWriter(new FileWriter("cars.txt"));

        cars.add("Мерс");
        cars.add("Ауди");
        cars.add("Жигуль");
        cars.add("Рено");
        cars.add("Жигуль");
        cars.add("Жигуль");
        cars.add("Ауди");

        //Проитерировать список через for-each и отпечатать слова в файл cars через с новой строки в кавычках

        for (String car : cars) {
            out.write("\"" + car + "\"");
            out.newLine();
        }
        out.close();

        //Найти и удалить из набора авто, в названии которых больше 4 букв

        List<String> newCars = new ArrayList<>();
        for (String car : cars) {
            if (car.length() <= 4) {
                newCars.add(car);
            }
        }
        cars = newCars;
        System.out.println(cars);

    }
}