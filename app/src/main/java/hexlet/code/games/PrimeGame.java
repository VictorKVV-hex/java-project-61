package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.GenerateRandomInt;



public class PrimeGame {
    public static void create() {
        int rNumber = 0;
        int i;
        final int rStart = 0;
        final int rStop = 100;
        final int countOfGame = 3;
        String isPrime = "yes";
        final int m1 = 3;
        final int m2 = 2;
        final String rule = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] rezGame = new String[m1][m2];
        for (i = 0; i < countOfGame; i++) {
            rNumber = GenerateRandomInt.generate(rStart, rStop);
            isPrime = isPrimeF(rNumber);
            rezGame[i][0] = String.valueOf(rNumber);
            rezGame[i][1] = isPrime;
        }
        Engine.goGame(rule, rezGame);
    }

    public static String isPrimeF(int rNumber) {
        String isPrime = "yes";
        if (rNumber < 2) {
            isPrime = "no";
        }
        for (int j = 2; j < rNumber; j++) {
            if (rNumber % j == 0) {
                isPrime = "no";
                break;
            }
        }
        return isPrime;
    }
}
