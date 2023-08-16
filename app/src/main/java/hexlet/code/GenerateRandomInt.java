package hexlet.code;

import java.util.Random;

public class GenerateRandomInt implements Generator{

    @Override
    public <T> T generate(int min, int max) {
        Random r = new Random();
        Integer digit = r.nextInt(max- min) + min;
        return (T) digit;
    }
}
