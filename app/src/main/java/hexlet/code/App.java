package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("0 - Exit");
        System.out.println("Your choice: ");
        String choice = scanner.next();
        Engine engine = new Engine();
        if (choice.equals("1")) {
            Cli.greating();
        } else if (choice.equals("2")) {
            engine.rG(2);
        } else if (choice.equals("3")) {
            engine.rG(3);
        } else if (choice.equals("4")) {
            engine.rG(4);
        } else if (choice.equals("5")) {
            engine.rG(5);
        }
        scanner.close();
//        Cli.greating();
    }
}
