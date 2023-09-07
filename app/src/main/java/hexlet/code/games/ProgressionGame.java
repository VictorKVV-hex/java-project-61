package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.GenerateRandomInt;

import java.util.Arrays;


public class ProgressionGame {
//    public static String getNumTwoPoints() {
//        return numTwoPoints;
//    }
//
//    public static void setNumTwoPoints(String numTwoPoints1) {
//        ProgressionGame.numTwoPoints = numTwoPoints1;
//    }
//
//    private static String numTwoPoints = "";
    static final int R_GSTART = 0;
    static final int R_GSTOP = 5;
    static final int COUNT_OF_GAME = 3;
    static final int SIZE_1 = 3;
    static final int SIZE_2 = 2;
    static final String RULE = "What number is missing in the progression?";
    static final int R_STOP_1 = 15;
    static final int R_START_D = 1;
    static final int R_STOP_D = 5;

    public static void create() {
        String numTwoPoints = "";
        int rStart = 0;
        int rStop = 0;
        int rTwoPoints = 0;
        int i;
        int aPlusOne = 0;
        int a = 0;
        int d = 0;
        String[][] rezGame = new String[SIZE_1][SIZE_2];
        for (i = 0; i < COUNT_OF_GAME; i++) {
            rStart = GenerateRandomInt.generate(R_GSTART, R_GSTOP);
            final int rStart1 = rStart + 5;
            rStop = GenerateRandomInt.generate(rStart1, R_STOP_1);
            rTwoPoints = GenerateRandomInt.generate(rStart, rStop);
            d = GenerateRandomInt.generate(R_START_D, R_STOP_D);
            String[] massP = getMassAndPoints(rStart, rStop, d);
            numTwoPoints = massP[rTwoPoints];
            massP[rTwoPoints] = "..";
            rezGame[i][0] = String.join(" ", massP);
            rezGame[i][1] = numTwoPoints;
            Arrays.fill(massP, null);
        }
        Engine.goGame(RULE, rezGame);
    }

    public static String[] getMassAndPoints(int rStart, int rStop, int d) {
        int aPlusOne = 0;
        int a = rStart;
        String[] massP = new String[rStop];
        for (int p = 0; p < rStop; p++) {
            aPlusOne = a + d;
            massP[p] = String.valueOf(aPlusOne);
            a = aPlusOne;
        }
        return massP;
    }
}
