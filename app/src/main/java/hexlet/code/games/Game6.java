package hexlet.code.games;

import hexlet.code.GenerateRandomInt;



public class Game6 {
    public static String[][] create() {
        int rNumber = 0;
        int i;
        final int rGs = 0;
        final int rGp = 100;
        final int countOfGame = 3;
        String isPrime = "yes";
        final int m1 = 3;
        final int m2 = 2;
        String[][] rezGame = new String[m1][m2];
        for (i = 0; i < countOfGame; i++) {
            rNumber = GenerateRandomInt.generate(rGs, rGp);
            isPrime = "yes";
            if (rNumber < 2) {
                isPrime = "no";
            }
            for (int j = 2; j < rNumber; j++) {
                if (rNumber % j == 0) {
                    isPrime = "no";
                    break;
                }
            }
            rezGame[i][0] = String.valueOf(rNumber);
            rezGame[i][1] = isPrime;
        }
        return rezGame;
    }
}
