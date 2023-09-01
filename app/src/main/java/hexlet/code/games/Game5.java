package hexlet.code.games;

import hexlet.code.GenerateRandomInt;

import java.util.Arrays;


public class Game5 {
    public static String[][] create() {
        int rStart = 0;
        int rStop = 0;
        int rTwoPoints = 0;
        int i;
        int aPlusOne = 0;
        int a = 0;
        int d = 0;
        String numTwoPoints = "";
        final int rGs = 0;
        final int rGp = 5;
        final int countOfGame = 3;
//        System.out.println("What number is missing in the progression?");
        String[][] rezGame = new String[3][2];
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
            a = rStart;
            for (int p = 0; p < rStop; p++) {
                aPlusOne = a + d;
                massP[p] = String.valueOf(aPlusOne);
                if (p == rTwoPoints) {
                    massP[p] = "..";
                    numTwoPoints = String.valueOf(aPlusOne);
                }
                a = aPlusOne;
            }
            rezGame[i][0] = String.join(" ", massP);
            rezGame[i][1] = String.valueOf(numTwoPoints);
//            System.out.println("Question: " + String.join(" ", massP));
            Arrays.fill(massP, null);
//            System.out.print("Your answer: ");
//            String answer = scanner.next();
//            if (numTwoPoints.equals(answer)) {
//                System.out.println("Correct!");
//            } else {
//                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + numTwoPoints + "'.");
//                System.out.println("Let's try again, " + userName + "!");
//                break;
//            }
        }
//        if (i > 2) {
//            System.out.println("Congratulations, " + userName + "!");
//        }
        return rezGame;
    }
}
