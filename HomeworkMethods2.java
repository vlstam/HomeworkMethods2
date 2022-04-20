/**
 * Да напишем програма за хвърляне на зарове, като
 * използваме Math.random();
 * Може да имаме няколко играчи, като всеки от тях
 * „хвърля“ 2 зара, печели този играч, които изкара
 * възможно най-високият сбор от двата зара.
 */
package homework;

import java.util.Scanner;

public class HomeworkMethods2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter how many sides would you like your die to have and how many dice would you like to roll?");
        int dice1 = diceMethod(scanner);
        int dice2 = diceMethod(scanner);
        System.out.println(dice1 + " " + dice2);
        if(dice1 > dice2){
            System.out.println("Player 1 wins!");

        } else{
            System.out.println("Player 2 winds!");
        }

        //System.out.println(diceMethod(6));
    }


    static int diceMethod(Scanner scanner) {
        int diceSide = scanner.nextInt();
        return (int) ((Math.random() * diceSide + 1) + (Math.random() * diceSide + 1));


        //return (int) ((Math.random() * dice + 1));
    }
}
