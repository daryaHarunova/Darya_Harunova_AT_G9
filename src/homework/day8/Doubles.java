package homework.day8;


import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Doubles {
    public static void main(String[] args) throws IOException {
        List<Double> doubles = Arrays.asList(33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9);

        //Проитерировать список через for-each и отпечатать числа в консоль через пробел

        for (Double number : doubles) {
            System.out.print(number + " ");
        }
//Посчитать произведение всех чисел и вывести результат в консоль

        Double multiply = 1.00;

        for (Double number : doubles) {
            multiply = number * multiply;
        }
        System.out.println(multiply);

        //найти сумму всех дробных частей и вывести результат в консоль

        Double sum = 0.00;

        for (Double number : doubles) {
            sum = number + sum;
        }
        System.out.println(sum);

        //Проитерировать список по индексу и вывести целые части в консоль через пробел

        for (int i = 0; i < doubles.size(); i++){
            System.out.print(doubles.get(i).intValue() + " ");
        }
    }
}
