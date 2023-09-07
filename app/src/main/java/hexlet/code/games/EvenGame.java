package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.GenerateRandomInt;



public class EvenGame {
    static final int START_NUMBER = 0;
    static final int STOP_NUMBER = 100;
    static final int COUNT_OF_GAME = 3;
    static final int SIZE_1 = 3;
    static final int SIZE_2 = 2;
    static final String RULE = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void create() {
        int rNumber = 0;
        int i;
        String[][] rezGame = new String[SIZE_1][SIZE_2];
        for (i = 0; i < COUNT_OF_GAME; i++) {
            rNumber = GenerateRandomInt.generate(START_NUMBER, STOP_NUMBER);
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
