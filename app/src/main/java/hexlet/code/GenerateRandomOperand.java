package hexlet.code;

import java.util.Random;

public class GenerateRandomOperand {

    public static String generate(int min, int max) {
        char[] arrOperand = {'+', '-', '*'};
        Random random = new Random();
        String operand = String.valueOf(arrOperand[random.nextInt(arrOperand.length)]);
        return operand;
    }
}
