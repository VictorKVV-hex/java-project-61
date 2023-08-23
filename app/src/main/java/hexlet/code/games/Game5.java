package hexlet.code.games;

import hexlet.code.GenerateRandomInt;

import java.util.Arrays;
import java.util.Scanner;

public class Game5 {
    public static void create(Scanner scanner, String userName) {
        int rStart = 0;
        int rStop = 0;
        int rTwoPoints = 0;
        int i;
        int aPlusOne = 0;
        int a = 0;
        int d = 0;
        String numTwoPoints = "";
        System.out.println("What number is missing in the progression?");
        for (i = 0; i < 3; i++) {
//            rStart = generateController.generate(new GenerateRandomInt(), 0, 5);
//            rStop = generateController.generate(new GenerateRandomInt(), rStart + 5, 15);
//            rTwoPoints = generateController.generate(new GenerateRandomInt(), rStart, rStop);
//            d = generateController.generate(new GenerateRandomInt(), 1, 5);
            rStart = GenerateRandomInt.generate(0, 5);
            rStop = GenerateRandomInt.generate(rStart + 5, 15);
            rTwoPoints = GenerateRandomInt.generate(rStart, rStop);
            d = GenerateRandomInt.generate(1, 5);
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
//            System.out.println("Question: " + Arrays.toString(massP));
            System.out.println("Question: " + String.join(" ", massP));
            Arrays.fill(massP, null);
            System.out.print("Your answer: ");
            String answer = scanner.next();
            if (numTwoPoints.equals(answer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + numTwoPoints + "'.");
                System.out.println("Let's try again, " + userName + "!");
                break;
            }
        }
        if (i > 2) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }
}
