package hexlet.code.games;

import hexlet.code.GenerateRandomInt;



public class Game4 {
    public static String[][] create() {
        int rNumber1 = 0;
        int rNumber2 = 0;
        String rExpression = "";
        int progAns = 1;
        int i;
        final int rGs = 1;
        final int rGp = 100;
        final int countOfGame = 3;
        final int m1 = 3;
        final int m2 = 2;
        String[][] rezGame = new String[m1][m2];
        System.out.println("Find the greatest common divisor of given numbers.");
        for (i = 0; i < countOfGame; i++) {
            rNumber1 = GenerateRandomInt.generate(rGs, rGp);
            rNumber2 = GenerateRandomInt.generate(rGs, rGp);
            rExpression = rNumber1 + " " + rNumber2;
            for (int j = 1; j <= rNumber1 && j <= rNumber2; j++) {
                if (rNumber1 % j == 0 && rNumber2 % j == 0) {
                    progAns = j;
                }
            }
            rezGame[i][0] = rExpression;
            rezGame[i][1] = String.valueOf(progAns);
        }
        return rezGame;
    }
}
