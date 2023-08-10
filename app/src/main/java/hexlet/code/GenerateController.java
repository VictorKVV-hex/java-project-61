package hexlet.code;

public class GenerateController {
    public <T> T Generate(Generator somethingGenerator){
        return (T) somethingGenerator.generate();
    }
}
