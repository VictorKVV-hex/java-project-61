package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.print("1 - Greet ");
        System.out.print("0 - Exit ");
        System.out.print("Your choice: ");
        String choice = scanner.next();
        if (choice.equals("1")) {
            Cli.greating();
        } else if (choice.equals("2")) {
            randomGame.rG();

        }
        scanner.close();
//        Cli.greating();
    }
}
