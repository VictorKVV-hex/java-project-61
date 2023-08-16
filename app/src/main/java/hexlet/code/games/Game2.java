package hexlet.code.games;

import hexlet.code.GenerateController;
import hexlet.code.GenerateRandomInt;

import java.util.Scanner;

public class Game2 {
    public static void Create(GenerateController generateController, Scanner scanner,String userName){
        int rNumber = 0;
        int i;
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        for (i = 0; i < 3; i++) {
            rNumber = generateController.Generate(new GenerateRandomInt(), 0,100);
            String isEven = (rNumber % 2 == 0) ? "yes" : "no";
            System.out.println("Question: " + rNumber);
            System.out.print("Your answer: ");
            String answer = scanner.next();
            if (isEven.equals(answer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + isEven + "'.");
                System.out.println("Let's try again, " + userName + "!");
                break;
            }
        }
        if (i > 2) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }

}
