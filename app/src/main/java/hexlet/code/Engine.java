package hexlet.code;

import java.util.Scanner;

public class Engine {
//    GenerateController generateController;
//    static int rNumber = 0;
//    static Scanner scanner;
//    static int i;
//    static final int GAME_EVEN = 2;
//    static final int GAME_CALC = 3;
//    static final int GAME_GCD = 4;
//    static final int GAME_PROGRESSION = 5;
//    static final int GAME_PRIME = 6;

    public static String getUserName() {
        return userName;
    }

    public static void setUserName(String userName2) {
        Engine.userName = userName2;
    }

    private static String userName;

    public static void goGame(int numGame, String[][] rezGame) {
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Engine.setUserName(scanner.next());
        System.out.println("Hello, " + getUserName() + "!");
        System.out.println(Engine.getStrMainQuestion(numGame));
        for (i = 0; i < 3; i++) {
            String sQuestion = rezGame[i][0];
            String answerGame = rezGame[i][1];
            System.out.println("Question: " + sQuestion);
            System.out.print("Your answer: ");
            String answer = scanner.next();
            if (answerGame.equals(answer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + answerGame + "'.");
                System.out.println("Let's try again, " + userName + "!");
                break;
            }
        }
        if (i > 2) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }

//    public static void rG(int numGame) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Welcome to the Brain Games!");
//        System.out.print("May I have your name? ");
////        userName = scanner.next();
//        Engine.setUserName(scanner.next());
//        System.out.println("Hello, " + getUserName() + "!");
////        System.out.println(getStrMainQuestion(numGame));  // Вопрос игры.
////        GenerateController generateController = new GenerateController();
//        bodyGame(numGame, scanner);
//    }

    public static String getStrMainQuestion(int numGame) {
        String question = "";
        switch (numGame) {
            case  2:
                question = "Answer 'yes' if the number is even, otherwise answer 'no'.";
                break;
            case  3:
                question = "What is the result of the expression?";
                break;
            case  4:
                question = "Find the greatest common divisor of given numbers.";
                break;
            case  5:
                question = "What number is missing in the progression?";
                break;
            case  6:
                question = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
                break;
            default:
                break;
        }
        return question;
    }
//    public static void bodyGame(int numGame, Scanner scanner) {
//        if (numGame == GAME_EVEN) {
////            Game2.create(scanner, getUserName());
//        } else if (numGame == GAME_CALC) {
////            Game3.create(scanner, getUserName());
//        } else if (numGame == GAME_GCD) {
////            Game4.create(scanner, getUserName());
//        } else if (numGame == GAME_PROGRESSION) {
////            Game5.create(scanner, getUserName());
//        } else if (numGame == GAME_PRIME) {
////            Game6.create(scanner, getUserName());
//        }
//    }
}
