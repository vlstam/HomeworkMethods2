package homework;

import java.util.Scanner;

public class HomeworkMethods2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter how many sides would you like your die to have and how many dice would you like to roll?");
        for (int a = 0; a <= 1; a++) {
            System.out.println("Second player, please enter the same parameters: ");
            System.out.println(diceMethod(scanner));

        }

        //System.out.println(diceMethod(6));
    }


    static int diceMethod(Scanner scanner) {
        int diceSide = scanner.nextInt();
        int dice = scanner.nextInt();
        return (int) ((Math.random() * diceSide + 1) * dice);


        //return (int) ((Math.random() * dice + 1));
    }
}

