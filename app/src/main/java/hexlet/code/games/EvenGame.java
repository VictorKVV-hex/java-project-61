package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.GenerateRandomInt;



public class EvenGame {
    private static final int START_NUMBER = 0;
    private static final int STOP_NUMBER = 100;
    private static final int COUNT_OF_GAME = 3;
    private static final int SIZE_1 = 3;
    private static final int SIZE_2 = 2;
    private static final String RULE = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void create() {
        String[][] rezGame = new String[SIZE_1][SIZE_2];
        for (int i = 0; i < COUNT_OF_GAME; i++) {
            int rNumber = GenerateRandomInt.generate(START_NUMBER, STOP_NUMBER);
            String isEven = (isEvenF(rNumber)) ? "yes" : "no";
            rezGame[i][0] = String.valueOf(rNumber);
            rezGame[i][1] = isEven;
        }
        Engine.goGame(RULE, rezGame);
    }
    public static boolean isEvenF(int rNumber) {
        boolean isEven = rNumber % 2 == 0;
        return isEven;
    }

}
