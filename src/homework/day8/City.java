package homework.day8;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class City {
    public static void main(String[] args) throws IOException {
        List<String> cities = new ArrayList<>();

        cities.add("Минск");
        cities.add("Москва");
        cities.add("Берлин");

        for (String element : cities) {
            System.out.println(element);
        }

        int count = 0;

        for (String city : cities) {
            count = count + city.length();
        }
        System.out.println(count);

        for (int i = 0; i < cities.size(); i++) {
            System.out.print(cities.get(i) + " ");
        }


    }
}
