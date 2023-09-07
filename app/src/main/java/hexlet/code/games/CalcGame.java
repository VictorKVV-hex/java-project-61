package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.GenerateRandomInt;

import java.util.Random;


public class CalcGame {
    static final int R_START = 0;
    static final int R_STOP = 100;
    static final int COUNT_OF_GAME = 3;
    static final int SIZE_1 = 3;
    static final int SIZE_2 = 2;
    static final String RULE = "What is the result of the expression?";

    public static void create() {
        int rNumber1 = 0;
        int rNumber2 = 0;
        String rOperand = "";
        String rExpression = "";
        int progAns = 0;
        int i;
        String[][] rezGame = new String[SIZE_1][SIZE_2];
        for (i = 0; i < COUNT_OF_GAME; i++) {
            rNumber1 = GenerateRandomInt.generate(R_START, R_STOP);
            rNumber2 = GenerateRandomInt.generate(R_START, R_STOP);
            rOperand = generateRandomOperand(R_START, R_STOP);
            rExpression = rNumber1 + " " + rOperand + " " + rNumber2;

            progAns = expression(rOperand, rNumber1, rNumber2);
            rezGame[i][0] = rExpression;
            rezGame[i][1] = String.valueOf(progAns);
        }
        Engine.goGame(RULE, rezGame);
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
