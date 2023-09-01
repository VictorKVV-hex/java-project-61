package hexlet.code;

import hexlet.code.games.Game2;
import hexlet.code.games.Game3;
import hexlet.code.games.Game4;
import hexlet.code.games.Game5;
import hexlet.code.games.Game6;

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
        switch (choice) {
            case "1":
                Cli.greating();
                break;
            case  "2":
                Engine.goGame(numGame2, Game2.create());
                break;
            case  "3":
                Engine.goGame(numGame3, Game3.create());
                break;
            case  "4":
                Engine.goGame(numGame4, Game4.create());
                break;
            case  "5":
                Engine.goGame(numGame5, Game5.create());
                break;
            case  "6":
                Engine.goGame(numGame6, Game6.create());
                break;
            default:
                break;
        }
        scanner.close();
    }
}
