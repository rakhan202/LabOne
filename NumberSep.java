/**
 * Created by rizwan khan on 6/17/2017.
 * This Java program prompts user for an integer number then analyzes whether the digits cubed equal the sum of the integer.
 */

import java.util.Scanner;

public class NumberSep {

    public static void main(String[] args) {

        //Creates new NumberSep object
        NumberSep ns = new NumberSep();

        //Runs the TrueorFalse method which returns nothing
        ns.TrueorFalse();
    }

    //Creates TrueorFalse method
    void TrueorFalse() {
        int input = 0;

        //Creates scanner object
        Scanner scan = new Scanner(System.in);

        do {
            //Outputs prompt
            System.out.println("Enter a number: ");

            //User validation method in while loop to determine whether input is valid, if not prompts user for valid input
            while (!scan.hasNextInt()) {
                String z = scan.next();
                System.out.println(z + " is not a valid number.");
            }
            input = scan.nextInt();
        } while (input < 0);
        int number = input;
        int sum = 0;

        //goes through each digit in number to cube then adds number to sum
        while (number > 0) {
            int x = number % 10;
            System.out.println("The cube of " + x + " is " + x * x * x);
            sum = sum + x * x * x;
            number = number / 10;
        }

        //determines whether sum of digits cubed equals original user number
        if (sum == input) {
            System.out.println("True");
        } else {

            //if number does not equal original number then outputs false
            System.out.println("False");
        }

        //outputs sum of digits cubed
        System.out.println("The sum is: " + sum);
    }
}


