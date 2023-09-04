package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static String getUserName() {
        return userName;
    }

    public static void setUserName(String userName2) {
        Engine.userName = userName2;
    }

    private static String userName;

    public static void goGame(String rule, String[][] rezGame) {
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Engine.setUserName(scanner.next());
        System.out.println("Hello, " + getUserName() + "!");
        System.out.println(rule);
        final int countOfGame = 3;
        for (i = 0; i < countOfGame; i++) {
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

}
