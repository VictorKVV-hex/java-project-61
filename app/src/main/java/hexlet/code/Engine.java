package hexlet.code;

import java.util.Scanner;

public class Engine {

    static final int GAME_EVEN = 2;
    static final int GAME_CALC = 3;
    static final int GAME_GCD = 4;
    static final int GAME_PROGRESSION = 5;
    static final int GAME_PRIME = 6;

    public static String getUserName() {
        return userName;
    }

    public static void setUserName(String userName2) {
        Engine.userName = userName2;
    }

    private static String userName;

    public static void goGame(String ruls, String[][] rezGame) {
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Engine.setUserName(scanner.next());
        System.out.println("Hello, " + getUserName() + "!");
//        System.out.println(Engine.getStrMainQuestion(numGame));
        System.out.println(ruls);
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



//    public static String getStrMainQuestion(int numGame) {
//        String question = "";
//        switch (numGame) {
//            case  GAME_EVEN:
//                question = "Answer 'yes' if the number is even, otherwise answer 'no'.";
//                break;
//            case  GAME_CALC:
//                question = "What is the result of the expression?";
//                break;
//            case  GAME_GCD:
//                question = "Find the greatest common divisor of given numbers.";
//                break;
//            case  GAME_PROGRESSION:
//                question = "What number is missing in the progression?";
//                break;
//            case  GAME_PRIME:
//                question = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
//                break;
//            default:
//                break;
//        }
//        return question;
//    }

}
