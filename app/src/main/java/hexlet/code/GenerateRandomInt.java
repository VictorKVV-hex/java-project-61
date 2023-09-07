package hexlet.code;

import java.util.Random;

public class GenerateRandomInt {

    public static int generate(int min, int max) {
        return new Random().nextInt(max - min) + min;
    }
}
