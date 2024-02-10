//- используя for вывести в консоль каждое нечетное число от 3 до 19 включительно
package homework.day2.cycleTask;

public class For {
    public static void main(String[] args) {
        for (int i = 3; i <= 19; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
    }
}
