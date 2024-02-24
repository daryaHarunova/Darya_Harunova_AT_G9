package homework.day8;

import java.util.ArrayList;
import java.util.List;

public class Butterfly {
    public static void main(String[] args) {
        List<String> butterflies = new ArrayList<>();

        butterflies.add("Common blue");
        butterflies.add("Common blue");
        butterflies.add("Aglais io");
        butterflies.add("Common blue");


        for (String butterfly : butterflies) {
            System.out.println("'" + butterfly + "'");
        }

        int count = 0;
        for (String butterfly : butterflies) {
            if (butterfly.contains("o")) {
                count++;
            }
        }
        System.out.println("Количество бабочек, содержащих букву 'о': " + count);
        for (int i = 0; i < butterflies.size(); i++) {
            System.out.print(butterflies.get(i) + " ");
        }

        for (String butterfly : butterflies) {
            System.out.println("\n" + butterfly);
        }
    }
}
