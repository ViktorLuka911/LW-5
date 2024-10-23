package Utilities;

import java.util.Scanner;

public class Utilities {

    //Функція для правильного введення
    public static int getValidatedInput(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        int input;
        do {
            System.out.print("\n\n\tВаш вибір: ");
            while (!scanner.hasNextInt()) {
                System.out.println("\n\tНевірний ввід! Введіть число.");
                scanner.next();
                System.out.print("\n\n\tВаш вибір: ");
            }
            input = scanner.nextInt();
        } while (input < min || input > max);
        return input;
    }

    // Функція для очищення консолі
    public static void clearConsole() {
        for (int clear = 0; clear < 10; clear++) {
            System.out.println("\n") ;
        }
    }

}