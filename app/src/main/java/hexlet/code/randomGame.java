package hexlet.code;

import java.util.Scanner;

public class randomGame {
    public static void rG() {
        int rNumber = (int)Math.random();
        String isEven = (rNumber % 2 == 0)  ? "yes" : "no";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        System.out.println("Question: " + rNumber);
        System.out.print("Your answer: ");
        String answer = scanner.next();
        if (isEven.equals(answer)) {

        }
    }
}
