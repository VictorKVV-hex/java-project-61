package hexlet.code.games;

import hexlet.code.GenerateRandomInt;

import java.util.Scanner;

public class Game2 {
    public static void create(Scanner scanner, String userName) {
        int rNumber = 0;
        int i;
        int rGs = 0;  // ��������� �������� ���������� �����
        int rGp = 100; // �������� �������� ���������� �����
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        for (i = 0; i < 3; i++) {
//            rNumber = generateController.generate(new GenerateRandomInt(), 0, 100);
            rNumber = GenerateRandomInt.generate(rGs, rGp);
            String isEven = (rNumber % 2 == 0) ? "yes" : "no";
            System.out.println("Question: " + rNumber);
            System.out.print("Your answer: ");
            String answer = scanner.next();
            if (isEven.equals(answer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + isEven + "'.");
                System.out.println("Let's try again, " + userName + "!");
                break;
            }
        }
        if (i > 2) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }

}
