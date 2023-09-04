package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.GenerateRandomInt;

import java.util.Random;


public class CalcGame {
    public static void create() {
        final int rStart = 0;
        final int rStop = 100;
        final int countOfGame = 3;
        final int m1 = 3;
        final int m2 = 2;
        final String rule = "What is the result of the expression?";
        int rNumber1 = 0;
        int rNumber2 = 0;
        String rOperand = "";
        String rExpression = "";
        int progAns = 0;
        int i;
        String[][] rezGame = new String[m1][m2];
        for (i = 0; i < countOfGame; i++) {
            rNumber1 = GenerateRandomInt.generate(rStart, rStop);
            rNumber2 = GenerateRandomInt.generate(rStart, rStop);
            rOperand = generateRandomOperand(rStart, rStop);
            rExpression = rNumber1 + " " + rOperand + " " + rNumber2;

            progAns = expression(rOperand, rNumber1, rNumber2);
            rezGame[i][0] = rExpression;
            rezGame[i][1] = String.valueOf(progAns);
        }
        Engine.goGame(rule, rezGame);
    }

    public static String generateRandomOperand(int min, int max) {
        char[] arrOperand = {'+', '-', '*'};
        Random random = new Random();
        String operand = String.valueOf(arrOperand[random.nextInt(arrOperand.length)]);
        return operand;
    }

    public static int expression(String sOperand, int nNumber1, int nNumber2) {
        int progAns = 0;
        switch (sOperand) {
            case "+": progAns = nNumber1 + nNumber2;
                break;
            case "-": progAns = nNumber1 - nNumber2;
                break;
            case "*": progAns = nNumber1 * nNumber2;
                break;
            default: progAns = nNumber1 + nNumber2;
        }
        return progAns;
    }
}
