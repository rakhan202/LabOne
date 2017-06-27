/**
 * Created by rizwa on 6/15/2017.
 */
import java.util.Scanner;
public class NumberReverse {



    public static void main(String[] args) {

        //Create scanner object
        Scanner input = new Scanner(System.in);

        //Output the prompt
        System.out.println("Enter a five digit integer to be reversed.");

        //Wait for the user to enter a number.
        int value = input.nextInt();

        //Tell them what they entered
        System.out.println("You entered: " + value);

        int reverse = 0;

        while (value > 0) {
            reverse *= 10;
            reverse += value % 10;
            value /= 10;
        }
        //Tell them the reverse of what they entered
        System.out.println("The reverse of that number is " + reverse);

    }
}
