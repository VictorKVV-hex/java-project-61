package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.GenerateRandomInt;



public class PrimeGame {
    final static int rStart = 0;
    final static int rStop = 100;
    final static int countOfGame = 3;
    final static int size1 = 3;
    final static int size2 = 2;
    final static String rule = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void create() {
        int rNumber = 0;
        int i;
        String isPrime = "yes";
        String[][] rezGame = new String[size1][size2];
        for (i = 0; i < countOfGame; i++) {
            rNumber = GenerateRandomInt.generate(rStart, rStop);
            isPrime = (isPrimeF(rNumber)) ? "yes": "no";
            rezGame[i][0] = String.valueOf(rNumber);
            rezGame[i][1] = isPrime;
        }
        Engine.goGame(rule, rezGame);
    }

    public static boolean isPrimeF(int rNumber) {
        boolean isPrime = true;
        if (rNumber < 2) {
            isPrime = false;
        }
        for (int j = 2; j < rNumber; j++) {
            if (rNumber % j == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}
