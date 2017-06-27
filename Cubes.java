/**
 * Created by rizwa on 6/16/2017.
 */
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {

        int input = 0;

        System.out.println("Enter a Number");
        Scanner scan = new Scanner(System.in);
        input = Integer.parseInt(scan.nextLine());

            int number = input;
            int counter = 0;

            int sum = 0;
            while (number > 0) {
                int t = number % 10;
                System.out.println("Cube of " + t + " is " + (t * t * t));
                sum += t * t * t;
                counter = counter + 1;
                number = number / 10;
            }
            System.out.println(sum);

            if (input == sum) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }

        }
    }
