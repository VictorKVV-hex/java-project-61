package hexlet.code;

import java.util.Random;

public class GenerateRandomInt {

    public static int generate(int min, int max) {
        Random r = new Random();
        int digit = r.nextInt(max - min) + min;
        return digit;
    }
}
