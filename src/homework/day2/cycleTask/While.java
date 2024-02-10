//используя while вывести в консоль все числа от 0 до 20 в 1 строку через пробел

package homework.day2.cycleTask;

public class While {
    public static void main(String[] args) {
        int number = 0;
        while (number <= 20) {
            System.out.print(number + " ");
            number++;
        }
    }
}
