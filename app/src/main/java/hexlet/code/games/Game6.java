package hexlet.code.games;

import hexlet.code.GenerateController;
import hexlet.code.GenerateRandomInt;

import java.util.Scanner;

public class Game6 {
    public static void create(GenerateController generateController, Scanner scanner, String userName) {
        int rNumber = 0;
        int i;
        int a;
        String isPrime = "yes";
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        for (i = 0; i < 3; i++) {
            rNumber = generateController.generate(new GenerateRandomInt(), 0, 100);
            isPrime = "yes";
            if (rNumber < 2) {
                isPrime = "no";
            }
            for (int j = 2; j < rNumber; j++) {
                if (rNumber % j == 0) {
                    isPrime = "no";  //не простое
                    break;
                }
            }
            System.out.println("Question: " + rNumber);
            System.out.print("Your answer: ");
            String answer = scanner.next();
            if (isPrime.equals(answer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + isPrime + "'.");
                System.out.println("Let's try again, " + userName + "!");
                break;
            }
        }
        if (i > 2) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }
}
