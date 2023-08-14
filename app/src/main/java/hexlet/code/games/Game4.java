package hexlet.code.games;

import hexlet.code.GenerateController;
import hexlet.code.GenerateRandomInt;

import java.util.Scanner;

public class Game4 {
    public static void Create(GenerateController generateController, Scanner scanner, String userName){
        int rNumber1 = 0;
        int rNumber2 = 0;
        String rExpression = "";
        int progAns = 1;
        int i;
        System.out.println("Find the greatest common divisor of given numbers.");
        for (i = 0; i < 3; i++) {
            rNumber1 = generateController.Generate(new GenerateRandomInt());
            rNumber2 = generateController.Generate(new GenerateRandomInt());
            rExpression = rNumber1 + " " + rNumber2;
            System.out.println("Question: " + rExpression);
            System.out.print("Your answer: ");
            String answer = scanner.next();
            for (int j = 1; j <= rNumber1 && j <= rNumber2; j++) {
                if (rNumber1 % j == 0 && rNumber2 % j == 0) {
                    progAns = j;
                }
            }
            if (progAns == Integer.parseInt(answer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + progAns + "'.");
                System.out.println("Let's try again, " + userName + "!");
                break;
            }
        }
        if (i > 2) {
            System.out.println("Congratulations, " + userName + "!");
        }

    }
}
