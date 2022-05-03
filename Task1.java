package solution;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char symbol = scanner.next().charAt(0);
        if (Character.isDigit(symbol)) {
            System.out.println("Это цифра!");
        } else if (Character.isLetter(symbol)) {
            System.out.println("Это буква!");
        } else if (Character.isWhitespace(symbol)) {
            System.out.println("Это пробел!");
        } else {
            System.out.println("Просто символ...");
        }
    }
}
