//Создать поток данных дробных чисел doubles из 8 чисел (33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9) через (Stream.of())
//Округлить каждое число до целого
//На основании этого потока сгенерировать новый поток данных целых чисел из случайных чисел
// с границами от 0 до числа из иходного потока данных
//Убрать дубликаты значений
//Заменить каждое число в получившемся потоке данных новым потоком состоящим из обьектов Bubble в количестве равному заменяемому числу,
//создавая обьекты с обьемом равным числу из исходного потока и именем по маске "Bubble vol-" + i, где i - число из исходного потока
//Отпечатать в консоль каждый из обьектов нового потока с новой строки
//Найти общий обьем полученного потока пузырьков и отпечатать в консоль

package homework.day9;
import homework.day8.classes.Bubble;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DoublesRunner {
    public static void main(String[] args) {
        Stream<Double> doubles = Stream.of(33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9);
        Random random = new Random();
//        int sum = doubles
//                .mapToInt(d -> random.nextInt(0, (int) Math.round(d) + 1))
//                .distinct()
//                .mapToObj(i -> IntStream.range(0, i)
//                        .mapToObj(Bubble::new)
//                        .collect(Collectors.toList()))
//                .peek(s -> s.stream().peek(System.out::println)
//                        .collect(Collectors.toList()))
//                .flatMapToInt(s -> IntStream.of(s.stream()
//                        .mapToInt(Bubble::getVolume)
//                        .sum()))
//                .sum();
//        System.out.println(sum);

        int sum = doubles
                .mapToInt(d -> random.nextInt(0, (int) Math.round(d) + 1))
                .mapToObj(i -> IntStream.range(0, i)
                        .mapToObj(Bubble::new))
                .flatMapToInt(s -> IntStream.of(s.mapToInt(Bubble::getVolume).sum()))
                .sum();
        System.out.println(sum);

    }
}


