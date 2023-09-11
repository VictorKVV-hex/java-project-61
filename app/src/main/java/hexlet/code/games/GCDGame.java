package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.GenerateRandomInt;



public class GCDGame {
    private static final int R_START = 1;
    private static final int R_STOP = 100;
    private static final int COUNT_OF_GAME = 3;
    private static final int SIZE_1 = 3;
    private static final int SIZE_2 = 2;
    private static final String RULE = "Find the greatest common divisor of given numbers.";

    public static void create() {
        String[][] rezGame = new String[SIZE_1][SIZE_2];
        for (int i = 0; i < COUNT_OF_GAME; i++) {
            int rNumber1 = GenerateRandomInt.generate(R_START, R_STOP);
            int rNumber2 = GenerateRandomInt.generate(R_START, R_STOP);
            String rExpression = rNumber1 + " " + rNumber2;
            int progAns = gCDF(rNumber1, rNumber2);
            rezGame[i][0] = rExpression;
            rezGame[i][1] = String.valueOf(progAns);
        }
        Engine.goGame(RULE, rezGame);
    }

    public static int gCDF(int nNumber1, int nNumber2) {
        int progAns = 1;
        for (int j = 1; j <= nNumber1 && j <= nNumber2; j++) {
            if (nNumber1 % j == 0 && nNumber2 % j == 0) {
                progAns = j;
            }
        }
        return progAns;
    }
}
