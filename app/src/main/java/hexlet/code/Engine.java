package hexlet.code;

import java.util.Scanner;

public class Engine {
//    GenerateController generateController;
//    static int rNumber = 0;
//    static Scanner scanner;
//    static int i;
    String userName;

    public void rG(int numGame) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(getStrMainQuestion(numGame));  // Вопрос игры.
        GenerateController generateController = new GenerateController();
//        for (i = 0; i < 3; i++) {
//            rNumber = generateController.Generate(new GenerateRandomInt());
//            String isEven = (rNumber % 2 == 0)  ? "yes" : "no";
//            System.out.println("Question: " + rNumber);
//            System.out.print("Your answer: ");
//            String answer = scanner.next();
//            if (isEven.equals(answer)) {
//                System.out.println("Correct!");
//            }
//            else {
//                System.out.println("'"+ answer + "' is wrong answer ;(. Correct answer was '"+ isEven +"'.");
//                System.out.println("Let's try again, " + userName + "!");
//                break;
//            }
//        }
        bodyGame(numGame, generateController, scanner);
//        if (i >= 2) {
//            System.out.println("Congratulations, " + userName + "!");
//        }
    }

    public String getStrMainQuestion(int numGame) {
        String question = "";
        if (numGame == 2) {
            question = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        } else if (numGame == 3) {
            question = "What is the result of the expression?";
        }
        return question;
    }
    public void bodyGame(int numGame,GenerateController generateController, Scanner scanner){
        if (numGame == 2) {
            int rNumber = 0;
            int i;
            for (i = 0; i < 3; i++) {
                rNumber = generateController.Generate(new GenerateRandomInt());
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
        } else if (numGame == 3) {
            int rNumber1 = 0;
            int rNumber2 = 0;
            String rOperand = "";
            String rExpression = "";
            int progAns = 0;
            int i;
            for (i = 0; i < 3; i++) {
                rNumber1 = generateController.Generate(new GenerateRandomInt());
                rNumber2 = generateController.Generate(new GenerateRandomInt());
                rOperand = generateController.Generate(new GenerateRandomOperand());
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
    
}
