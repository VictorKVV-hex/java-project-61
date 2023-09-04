package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.GenerateRandomInt;



public class EvenGame {
    public static void create() {
        int rNumber = 0;
        int i;
        int startNumber = 0;
        final int  stopNumber = 100;
        final int countOfGame = 3;
        final int m1 = 3;
        final int m2 = 2;
        final String rule = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] rezGame = new String[m1][m2];
        for (i = 0; i < countOfGame; i++) {
            rNumber = GenerateRandomInt.generate(startNumber, stopNumber);
            String isEven = isEvenF(rNumber);
            rezGame[i][0] = String.valueOf(rNumber);
            rezGame[i][1] = isEven;
        }
        Engine.goGame(rule, rezGame);
    }
    public static String isEvenF(int rNumber) {
        String isEven = (rNumber % 2 == 0) ? "yes" : "no";
        return isEven;
    }

}
