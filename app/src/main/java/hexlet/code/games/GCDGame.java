package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.GenerateRandomInt;



public class GCDGame {
    final static int rStart = 1;
    final static int rStop = 100;
    final static int countOfGame = 3;
    final static int size1 = 3;
    final static int size2 = 2;
    final static String rule = "Find the greatest common divisor of given numbers.";

    public static void create() {
        int rNumber1 = 0;
        int rNumber2 = 0;
        String rExpression = "";
        int progAns = 1;
        int i;
        String[][] rezGame = new String[size1][size2];
        for (i = 0; i < countOfGame; i++) {
            rNumber1 = GenerateRandomInt.generate(rStart, rStop);
            rNumber2 = GenerateRandomInt.generate(rStart, rStop);
            rExpression = rNumber1 + " " + rNumber2;
            progAns = gCDF(rNumber1, rNumber2);
            rezGame[i][0] = rExpression;
            rezGame[i][1] = String.valueOf(progAns);
        }
        Engine.goGame(rule, rezGame);
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
