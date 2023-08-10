package hexlet.code;

import java.util.Random;

public class GenerateRandomOperand implements Generator{
    @Override
    public <T> T generate() {
        char[] arrOperand = {'+', '-', '*'};
        Random random = new Random();
        String Operand = String.valueOf(arrOperand[random.nextInt(arrOperand.length)]);
        return (T) Operand;
    }
}
