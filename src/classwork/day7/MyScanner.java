package classwork.day7;

import java.util.Scanner;

public class MyScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String incoming = scanner.nextLine();

            if (incoming.equalsIgnoreCase("string")) {
                System.out.println("stop");
                break;
            }
            System.out.printf("Just got %s text", incoming).println();
        }
    }
}