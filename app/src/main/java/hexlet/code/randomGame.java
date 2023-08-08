package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class randomGame {
    public static void rG() {
        int rNumber;
        int i;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        for (i = 0; i < 3; i++) {
            rNumber = (int)(Math.random()*10);
            Random r = new Random();
            rNumber = r.nextInt(100) + 1;
            String isEven = (rNumber % 2 == 0)  ? "yes" : "no";
            System.out.println("Question: " + rNumber);
            System.out.print("Your answer: ");
            String answer = scanner.next();
            if (isEven.equals(answer)) {
                System.out.println("Correct!");
            }
            else {
                System.out.println("'"+ answer + "' is wrong answer ;(. Correct answer was '"+ isEven +"'.");
                System.out.println("Let's try again, " + userName + "!");
                break;
            }
        }
        if (i >= 2) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }
}
