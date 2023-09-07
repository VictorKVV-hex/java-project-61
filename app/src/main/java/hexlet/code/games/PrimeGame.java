package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.GenerateRandomInt;



public class PrimeGame {
    static final int R_START = 0;
    static final int R_STOP = 100;
    static final int COUNT_OF_GAME = 3;
    static final int SIZE_1 = 3;
    static final int SIZE_2 = 2;
    static final String RULE = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void create() {
        int rNumber = 0;
        int i;
        String isPrime = "yes";
        String[][] rezGame = new String[SIZE_1][SIZE_2];
        for (i = 0; i < COUNT_OF_GAME; i++) {
            rNumber = GenerateRandomInt.generate(R_START, R_STOP);
            isPrime = (isPrimeF(rNumber)) ? "yes" : "no";
            rezGame[i][0] = String.valueOf(rNumber);
            rezGame[i][1] = isPrime;
        }
        Engine.goGame(RULE, rezGame);
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
