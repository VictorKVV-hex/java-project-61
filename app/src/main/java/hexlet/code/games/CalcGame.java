package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.GenerateRandomInt;

import java.util.Random;


public class CalcGame {
    private static final int R_START = 0;
    private static final int R_STOP = 100;
    private static final int COUNT_OF_GAME = 3;
    private static final int SIZE_1 = 3;
    private static final int SIZE_2 = 2;
    private static final String RULE = "What is the result of the expression?";
    private static final char[] ARR_OPERAND = {'+', '-', '*'};

    public static void create() {
        String[][] rezGame = new String[SIZE_1][SIZE_2];
        for (int i = 0; i < COUNT_OF_GAME; i++) {
            int rNumber1 = GenerateRandomInt.generate(R_START, R_STOP);
            int rNumber2 = GenerateRandomInt.generate(R_START, R_STOP);
            String rOperand = generateRandomOperand(R_START, R_STOP);
            String rExpression = rNumber1 + " " + rOperand + " " + rNumber2;

            int progAns = expression(rOperand, rNumber1, rNumber2);
            rezGame[i][0] = rExpression;
            rezGame[i][1] = String.valueOf(progAns);
        }
        Engine.goGame(RULE, rezGame);
    }

    public static String generateRandomOperand(int min, int max) {
        Random random = new Random();
        String operand = String.valueOf(ARR_OPERAND[random.nextInt(ARR_OPERAND.length)]);
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
            default: progAns = 0;
                break;
        }
        return progAns;
    }
}
