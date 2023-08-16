package hexlet.code;

public interface Generator {
    <T> T generate(int min, int max);
}
