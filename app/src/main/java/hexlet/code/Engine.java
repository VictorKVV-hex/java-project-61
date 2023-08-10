package hexlet.code;

import java.util.Scanner;

public class Engine {
    GenerateController generateController;
    public void rG(int numGame) {
        var rNumber = 0;
        int i;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(getStrMainQuestion(numGame));  // Вопрос игры.
        GenerateController generateController = new GenerateController();
        for (i = 0; i < 3; i++) {
            rNumber = generateController.Generate(new GenerateRandomInt());
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

    public static String getStrMainQuestion(int numGame) {
        String question = "";
        if (numGame == 2) {
            question = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        } else if (numGame == 3) {
            question = "What is the result of the expression?";
        }
        return question;
    }
    
}
