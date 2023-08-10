package hexlet.code;

import java.util.Random;

public class GenerateRandomInt implements Generator{

    @Override
    public <T> T generate() {
        Random r = new Random();
        Integer digit = r.nextInt(100) + 1;
        return (T) digit;
    }
}
