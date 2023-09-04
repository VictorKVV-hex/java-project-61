package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.GenerateRandomInt;

import java.util.Arrays;


public class ProgressionGame {
    public static String getNumTwoPoints() {
        return numTwoPoints;
    }

    public static void setNumTwoPoints(String numTwoPoints1) {
        ProgressionGame.numTwoPoints = numTwoPoints1;
    }

    private static String numTwoPoints = "";

    public static void create() {
        int rStart = 0;
        int rStop = 0;
        int rTwoPoints = 0;
        int i;
        int aPlusOne = 0;
        int a = 0;
        int d = 0;
//        String numTwoPoints = "";
        final int rGs = 0;
        final int rGp = 5;
        final int countOfGame = 3;
        final int m1 = 3;
        final int m2 = 2;
        final String rule = "What number is missing in the progression?";
        String[][] rezGame = new String[m1][m2];
        for (i = 0; i < countOfGame; i++) {
            rStart = GenerateRandomInt.generate(rGs, rGp);
            final int rGs1 = rStart + 5;
            final int rGp1 = 15;
            rStop = GenerateRandomInt.generate(rGs1, rGp1);
            rTwoPoints = GenerateRandomInt.generate(rStart, rStop);
            final int rGs2 = 1;
            final int rGp2 = 5;
            d = GenerateRandomInt.generate(rGs2, rGp2);
            String[] massP = new String[rStop];
            massP = getMassAndPoints(rStart, rStop, d, rTwoPoints, massP);
            rezGame[i][0] = String.join(" ", massP);
//            rezGame[i][1] = String.valueOf(numTwoPoints);
            rezGame[i][1] = String.valueOf(getNumTwoPoints());
            Arrays.fill(massP, null);
        }
        Engine.goGame(rule, rezGame);
    }

    public static String[] getMassAndPoints(int rStart, int rStop, int d, int rTwoPoints, String[] massP) {
        int aPlusOne = 0;
        int a = rStart;

        for (int p = 0; p < rStop; p++) {
            aPlusOne = a + d;
            massP[p] = String.valueOf(aPlusOne);
            if (p == rTwoPoints) {
                massP[p] = "..";
                setNumTwoPoints(String.valueOf(aPlusOne));
            }
            a = aPlusOne;
        }
        return massP;
    }
}
