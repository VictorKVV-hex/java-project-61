package hexlet.code;

import hexlet.code.games.EvenGame;
import hexlet.code.games.CalcGame;
import hexlet.code.games.GCDGame;
import hexlet.code.games.ProgressionGame;
import hexlet.code.games.PrimeGame;

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
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.println("Your choice: ");
        String choice = scanner.next();
        switch (choice) {
            case "1":
                Cli.greating();
                break;
            case  "2":
                EvenGame.create();
                break;
            case  "3":
                CalcGame.create();
                break;
            case  "4":
                GCDGame.create();
                break;
            case  "5":
                ProgressionGame.create();
                break;
            case  "6":
                PrimeGame.create();
                break;
            default:
                break;
        }
        scanner.close();
    }
}
