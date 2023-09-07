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
    final static int rGstart = 0;
    final static int rGstop = 5;
    final static int countOfGame = 3;
    final static int size1 = 3;
    final static int size2 = 2;
    final static String rule = "What number is missing in the progression?";
    final static int rStop1 = 15;
    final static int rStartD = 1;
    final static int rStopD = 5;

    public static void create() {
        String numTwoPoints = "";
        int rStart = 0;
        int rStop = 0;
        int rTwoPoints = 0;
        int i;
        int aPlusOne = 0;
        int a = 0;
        int d = 0;
        String[][] rezGame = new String[size1][size2];
        for (i = 0; i < countOfGame; i++) {
            rStart = GenerateRandomInt.generate(rGstart, rGstop);
            final int rStart1 = rStart + 5;
            rStop = GenerateRandomInt.generate(rStart1, rStop1);
            rTwoPoints = GenerateRandomInt.generate(rStart, rStop);
            d = GenerateRandomInt.generate(rStartD, rStopD);
            String[] massP = getMassAndPoints(rStart, rStop, d);
            numTwoPoints = massP[rTwoPoints];
            massP[rTwoPoints] = "..";
            rezGame[i][0] = String.join(" ", massP);
            rezGame[i][1] = numTwoPoints;
            Arrays.fill(massP, null);
        }
        Engine.goGame(rule, rezGame);
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
