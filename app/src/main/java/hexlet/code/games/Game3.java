package hexlet.code.games;

import hexlet.code.GenerateRandomInt;
import hexlet.code.GenerateRandomOperand;



public class Game3 {
    public static String[][] create() {
        int rNumber1 = 0;
        int rNumber2 = 0;
        String rOperand = "";
        String rExpression = "";
        int progAns = 0;
        int i;
        final int rGs = 0;  // Start number
        final int rGp = 100; // End number
        final int countOfGame = 3;
        final int m1 = 3;
        final int m2 = 2;
        String[][] rezGame = new String[m1][m2];
//        System.out.println("What is the result of the expression?");
        for (i = 0; i < countOfGame; i++) {
            rNumber1 = GenerateRandomInt.generate(rGs, rGp);
            rNumber2 = GenerateRandomInt.generate(rGs, rGp);
            rOperand = GenerateRandomOperand.generate(rGs, rGp);
            rExpression = rNumber1 + " " + rOperand + " " + rNumber2;
            switch (rOperand) {
                case "+": progAns = rNumber1 + rNumber2;
                    break;
                case "-": progAns = rNumber1 - rNumber2;
                    break;
                case "*": progAns = rNumber1 * rNumber2;
                    break;
                default: progAns = rNumber1 + rNumber2;
            }
            rezGame[i][0] = rExpression;
            rezGame[i][1] = String.valueOf(progAns);
//            System.out.println("Question: " + rExpression);
//            System.out.print("Your answer: ");
//            String answer = scanner.next();
//            if (progAns == Integer.parseInt(answer)) {
//                System.out.println("Correct!");
//            } else {
//                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + progAns + "'.");
//                System.out.println("Let's try again, " + userName + "!");
//                break;
//            }
        }
//        if (i > 2) {
//            System.out.println("Congratulations, " + userName + "!");
//        }
        return rezGame;
    }
}
