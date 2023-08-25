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
    static final int gameEven = 2;
    static final int gameCalc = 3;
    static final int gameGCD = 4;
    static final int gameProgression = 5;
    static final int gamePrime = 6;

    public static String getUserName() {
        return userName;
    }

    public static void setUserName(String userName) {
        Engine.userName = userName;
    }

    private static String userName;

    public static void rG(int numGame) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
//        userName = scanner.next();
        Engine.setUserName(scanner.next());
        System.out.println("Hello, " + getUserName() + "!");
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
        if (numGame == gameEven) {
            Game2.create(scanner, getUserName());
        } else if (numGame == gameCalc) {
            Game3.create(scanner, getUserName());
        } else if (numGame == gameGCD) {
            Game4.create(scanner, getUserName());
        } else if (numGame == gameProgression) {
            Game5.create(scanner, getUserName());
        } else if (numGame == gamePrime) {
            Game6.create(scanner, getUserName());
        }
    }
}
