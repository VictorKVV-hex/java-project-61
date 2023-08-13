package hexlet.code;

import hexlet.code.games.Game2;
import hexlet.code.games.Game3;
import hexlet.code.games.Game4;

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
//        System.out.println(getStrMainQuestion(numGame));  // Вопрос игры.
        GenerateController generateController = new GenerateController();
        bodyGame(numGame, generateController, scanner);
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
            Game2.Create(generateController, scanner, userName);
        } else if (numGame == 3) {
            Game3.Create(generateController, scanner, userName);
        } else if (numGame == 4) {
            Game4.Create(generateController, scanner, userName);
        }
    }
    
}
