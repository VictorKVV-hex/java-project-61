package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        final int numGame2 = 2;
        final int numGame3 = 3;
        final int numGame4 = 4;
        final int numGame5 = 5;
        final int numGame6 = 6;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.println("Your choice: ");
        String choice = scanner.next();
        Engine engine = new Engine();
        switch (choice) {
            case "1":
                Cli.greating();
                break;
            case  "2":
                engine.rG(numGame2);
                break;
            case  "3":
                engine.rG(numGame3);
                break;
            case  "4":
                engine.rG(numGame4);
                break;
            case  "5":
                engine.rG(numGame5);
                break;
            case  "6":
                engine.rG(numGame6);
                break;
            default:
                break;
        }

//        if (choice.equals("1")) {
//            Cli.greating();
//        } else if (choice.equals("2")) {
//            engine.rG(2);
//        } else if (choice.equals("3")) {
//            engine.rG(3);
//        } else if (choice.equals("4")) {
//            engine.rG(4);
//        } else if (choice.equals("5")) {
//            engine.rG(5);
//        } else if (choice.equals("6")) {
//            engine.rG(6);
//        }
        scanner.close();
//        Cli.greating();
    }
}
