package homework.day8;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Country {
    public static void main(String[] args) {
        List<String> countries  = new ArrayList<>();

        countries .add("Андора");
        countries .add("Португалия");
        countries .add("Англия");
        countries .add("Замбия");

        //Проитерировать список через for-each и отпечатать слова в консоль через запятую с пробелом

        for (String country : countries ) {
            System.out.print(country + ", ");
        }
        //Посчитать сколько стран, в названии которых меньше 7 букв и вывести число в консоль

        int count = 0;
        for (String country: countries){
            if (country.length() < 7){
                count ++;
            }
        }
        System.out.println(count);

      //  Проитерировать список по индексу и отпечатать слова в консоль с новой строки

        for (int i = 0; i < countries.size(); i++){
            System.out.println(countries.get(i));
        }

    }
}