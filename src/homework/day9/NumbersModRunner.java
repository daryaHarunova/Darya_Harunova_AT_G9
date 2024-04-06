//Создать поток данных целых чисел numbersMod из 8 чисел (626, 435, 9, 1463268, 24, 2237, 33, 9090) через (Stream.of())
//Отфильтровать те числа, которые содержать цифру 3
//Разбить числа на отдельные цифры и заменить цифры соответствующими словами
//Оставить только уникальные слова, отсортировать в нисходящем порядке и отпечатать в консоль с новой строки

package homework.day9;

import java.util.stream.Stream;

public class NumbersModRunner {
    public static void main(String[] args) {
        Stream<Integer> numbersMod = Stream.of(626, 435, 9, 1463268, 24, 2237, 33, 9090);
        numbersMod.filter(number -> String.valueOf(number).contains("3"))
                .flatMap(n -> Stream.of(String.valueOf(n).split("")))
                .map(Integer::parseInt)
                .map(n -> {
                    String word = null;
                    switch (n) {
                        case 1:
                            word = "один";
                            break;
                        case 2:
                            word = "два";
                            break;
                        case 3:
                            word = "три";
                            break;
                        case 4:
                            word = "четыре";
                            break;
                        case 5:
                            word = "пять";
                            break;
                        case 6:
                            word = "шесть";
                            break;
                        case 7:
                            word = "семь";
                            break;
                        case 8:
                            word = "восемь";
                            break;
                        case 9:
                            word = "девять";
                            break;
                    }
                    return word;
                })
                .distinct().sorted()
                .forEach(System.out::println);
    }
}


