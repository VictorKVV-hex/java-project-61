package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.GenerateRandomInt;



public class EvenGame {
    final static int startNumber = 0;
    final static int stopNumber = 100;
    final static int countOfGame = 3;
    final static int size1 = 3;
    final static int size2 = 2;
    final static String rule = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void create() {
        int rNumber = 0;
        int i;
        String[][] rezGame = new String[size1][size2];
        for (i = 0; i < countOfGame; i++) {
            rNumber = GenerateRandomInt.generate(startNumber, stopNumber);
            String isEven = (isEvenF(rNumber)) ? "yes": "no";
            rezGame[i][0] = String.valueOf(rNumber);
            rezGame[i][1] = isEven;
        }
        Engine.goGame(rule, rezGame);
    }
    public static boolean isEvenF(int rNumber) {
        boolean isEven = (rNumber % 2 == 0) ? true : false;
        return isEven;
    }

}
