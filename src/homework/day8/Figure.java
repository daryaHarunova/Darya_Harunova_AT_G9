package homework.day8;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Figure {
    public static void main(String[] args) throws IOException {
        List<String> figures = Arrays.asList("Овал", "Прямоугольник", "Круг", "Квадрат", "Эллипс");
        BufferedWriter out = new BufferedWriter(new FileWriter("new_file.txt"));
        for (String figure : figures) {
            out.write(figure + "-");
        }
        out.close();

        int count = 0;
        for (String figure : figures) {
            if (!figure.contains("и")) {
                count++;
            }
        }
        System.out.println(count);

        for (int i = 0; i < figures.size(); i++) {
            System.out.print(figures.get(i) + " ");
        }
        try {
            figures.add(3, "Треугольник");
        } catch (RuntimeException error) {
            System.out.println();
            System.out.println(error);
        }
        System.out.println(figures);

        for (String element : figures) {
            System.out.println(element);
        }


    }
}
