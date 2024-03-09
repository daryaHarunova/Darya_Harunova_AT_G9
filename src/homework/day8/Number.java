package homework.day8;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Number {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(3342);
        numbers.add(34);
        numbers.add(79);
        numbers.add(23426);
        numbers.add(68);
        numbers.add(1324);
        numbers.add(55);
        numbers.add(7699);

        //Проитерировать список через for-each и отпечатать числа в консоль новой строки

        for (Integer number: numbers){
            System.out.println(number);
        }
        //Посчитать сумму всех чисел и вывести результат в консоль

        int sum = 0;
        for (Integer number: numbers){
            sum = sum + number;
        }
        System.out.println(sum);

        //Отсортировать список по возрастанию

        Collections.sort(numbers);

        for (Integer number : numbers) {
            System.out.println(number);
        }
//Проитерировать список по индексу и отпечатать числа в консоль через пробел

        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
        }

        //Развернуть список в обратном порядке

        Collections.reverse(numbers);

        for (Integer number: numbers){
            System.out.println(number);
        }

        //Проитерировать список через for-each и отпечатать числа в консоль через пробел

        for (Integer number: numbers){
            System.out.print(number + " ");
        }

    }

}