package hexlet.code.games;

import hexlet.code.GenerateController;
import hexlet.code.GenerateRandomInt;
import hexlet.code.GenerateRandomOperand;

import java.util.Scanner;

public class Game3 {
    public static void Create(GenerateController generateController, Scanner scanner, String userName){
        int rNumber1 = 0;
        int rNumber2 = 0;
        String rOperand = "";
        String rExpression = "";
        int progAns = 0;
        int i;
        System.out.println("What is the result of the expression?");
        for (i = 0; i < 3; i++) {
            rNumber1 = generateController.Generate(new GenerateRandomInt());
            rNumber2 = generateController.Generate(new GenerateRandomInt());
            rOperand = generateController.Generate(new GenerateRandomOperand());
//                rOperand = "-";
            rExpression = rNumber1 + " " + rOperand + " " + rNumber2;
            switch (rOperand) {
                case "+": progAns = rNumber1 + rNumber2;
                    break;
                case "-": progAns = rNumber1 - rNumber2;
                    break;
                case "*": progAns = rNumber1 * rNumber2;
                    break;
            }
            System.out.println("Question: " + rExpression);
            System.out.print("Your answer: ");
            String answer = scanner.next();
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
