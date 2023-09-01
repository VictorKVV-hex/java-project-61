package hexlet.code.games;

import hexlet.code.GenerateRandomInt;



public class Game2 {
    public static String[][] create() {
        int rNumber = 0;
        int i;
        int startNumber = 0;  // Start number
        final int  stopNumber = 100; // End number
        final int countOfGame = 3;
        String[][] rezGame = new String[3][2];
        for (i = 0; i < countOfGame; i++) {
            rNumber = GenerateRandomInt.generate(startNumber, stopNumber);
            String isEven = (rNumber % 2 == 0) ? "yes" : "no";
            rezGame[i][0] = String.valueOf(rNumber);
            rezGame[i][1] = isEven;
        }
        return rezGame;
    }

}
