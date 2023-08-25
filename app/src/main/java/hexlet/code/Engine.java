package hexlet.code;

import hexlet.code.games.Game2;
import hexlet.code.games.Game3;
import hexlet.code.games.Game4;
import hexlet.code.games.Game5;
import hexlet.code.games.Game6;

import java.util.Scanner;

public class Engine {
//    GenerateController generateController;
//    static int rNumber = 0;
//    static Scanner scanner;
//    static int i;
    static final int numGame2 = 2;
    static final int numGame3 = 3;
    static final int numGame4 = 4;
    static final int numGame5 = 5;
    static final int numGame6 = 6;
    static String userName;

    public static void rG(int numGame) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
//        System.out.println(getStrMainQuestion(numGame));  // Вопрос игры.
//        GenerateController generateController = new GenerateController();
        bodyGame(numGame, scanner);
    }

//    public String getStrMainQuestion(int numGame) {
//        String question = "";
//        if (numGame == 2) {
//            question = "Answer 'yes' if the number is even, otherwise answer 'no'.";
//        } else if (numGame == 3) {
//            question = "What is the result of the expression?";
//        }
//        return question;
//    }
    public static void bodyGame(int numGame, Scanner scanner) {
        if (numGame == numGame2) {
            Game2.create(scanner, userName);
        } else if (numGame == numGame3) {
            Game3.create(scanner, userName);
        } else if (numGame == numGame4) {
            Game4.create(scanner, userName);
        } else if (numGame == numGame5) {
            Game5.create(scanner, userName);
        } else if (numGame == numGame6) {
            Game6.create(scanner, userName);
        }
    }
}
