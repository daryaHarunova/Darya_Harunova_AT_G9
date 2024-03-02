package homework.day9;

import java.time.LocalDate;

public class Date {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now(); // Получить сегодняшнюю дату
        LocalDate futureDate = today.plusDays(30); // Добавить 90 дней к сегодняшней дате

        System.out.println("Дата через 30 дней: " + futureDate);
    }
}
