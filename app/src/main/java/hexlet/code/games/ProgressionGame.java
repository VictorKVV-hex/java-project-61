package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.GenerateRandomInt;

import java.util.Arrays;


public class ProgressionGame {

    private static final int R_GSTART = 0;
    private static final int R_GSTOP = 5;
    private static final int COUNT_OF_GAME = 3;
    private static final int SIZE_1 = 3;
    private static final int SIZE_2 = 2;
    private static final String RULE = "What number is missing in the progression?";
    private static final int R_STOP_1 = 15;
    private static final int R_START_D = 1;
    private static final int R_STOP_D = 5;

    public static void create() {
        String numTwoPoints = "";
        String[][] rezGame = new String[SIZE_1][SIZE_2];
        for (int i = 0; i < COUNT_OF_GAME; i++) {
            int rStart = GenerateRandomInt.generate(R_GSTART, R_GSTOP);
            final int rStart1 = rStart + 5;
            int rStop = GenerateRandomInt.generate(rStart1, R_STOP_1);
            int rTwoPoints = GenerateRandomInt.generate(rStart, rStop);
            int dStep = GenerateRandomInt.generate(R_START_D, R_STOP_D);
            String[] massP = getMassAndPoints(rStart, rStop, dStep);
            numTwoPoints = massP[rTwoPoints];
            massP[rTwoPoints] = "..";
            rezGame[i][0] = String.join(" ", massP);
            rezGame[i][1] = numTwoPoints;
            Arrays.fill(massP, null);
        }
        Engine.goGame(RULE, rezGame);
    }

    public static String[] getMassAndPoints(int rStart, int rStop, int d) {
        int a = rStart;
        String[] massP = new String[rStop];
        for (int p = 0; p < rStop; p++) {
            int aPlusOne = a + d;
            massP[p] = String.valueOf(aPlusOne);
            a = aPlusOne;
        }
        return massP;
    }
}
