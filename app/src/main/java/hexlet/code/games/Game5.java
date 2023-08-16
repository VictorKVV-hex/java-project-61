package hexlet.code.games;

import hexlet.code.GenerateController;
import hexlet.code.GenerateRandomInt;

import java.util.Arrays;
import java.util.Scanner;

public class Game5 {
    public static void Create(GenerateController generateController, Scanner scanner, String userName){
        int rStart = 0;
        int rStop = 0;
        int rTwoPoints = 0;
        int i;
        int aPlusOne = 0;
        int a = 0 ;
        int d = 0;
        String numTwoPoints = "";
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        for (i = 0; i < 3; i++) {
            rStart = generateController.Generate(new GenerateRandomInt(), 0, 5);
            rStop = generateController.Generate(new GenerateRandomInt(), rStart+5,15);
            rTwoPoints = generateController.Generate(new GenerateRandomInt(), rStart, rStop);
            d = generateController.Generate(new GenerateRandomInt(), 1,5);
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
            System.out.println("Question: " + Arrays.toString(massP));
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
