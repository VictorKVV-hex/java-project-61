package hexlet.code;

public class GenerateController {
    public <T> T Generate(Generator somethingGenerator,int min, int max){
        return (T) somethingGenerator.generate(min, max);
    }
}
