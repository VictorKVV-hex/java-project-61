package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.GenerateRandomInt;



public class GCDGame {
    static final int R_START = 1;
    static final int R_STOP = 100;
    static final int COUNT_OF_GAME = 3;
    static final int SIZE_1 = 3;
    static final int SIZE_2 = 2;
    static final String RULE = "Find the greatest common divisor of given numbers.";

    public static void create() {
        int rNumber1 = 0;
        int rNumber2 = 0;
        String rExpression = "";
        int progAns = 1;
        int i;
        String[][] rezGame = new String[SIZE_1][SIZE_2];
        for (i = 0; i < COUNT_OF_GAME; i++) {
            rNumber1 = GenerateRandomInt.generate(R_START, R_STOP);
            rNumber2 = GenerateRandomInt.generate(R_START, R_STOP);
            rExpression = rNumber1 + " " + rNumber2;
            progAns = gCDF(rNumber1, rNumber2);
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
