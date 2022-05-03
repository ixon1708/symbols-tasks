package solution;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char symbol = scanner.next().charAt(0);
        if (Character.isLetter(symbol)) {
            if (Character.isUpperCase(symbol)) {
                System.out.println("Большая буква");
            } else {
                System.out.println("Маленькая буква");
            }
        } else {
            System.out.println("Это не буква.");
        }
    }
}
