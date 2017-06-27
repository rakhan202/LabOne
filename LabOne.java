/**
 * Created by rizwa on 6/26/2017.
 */

import java.util.Scanner;

public class LabOne {

    public static void main(String[] args) {

        String x = "";
        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("Welcome to Grand Circus' Room Detail Generator!");
            System.out.println();
            System.out.print("Enter length: ");
            double length = scan.nextDouble();
            System.out.print("Enter width: ");
            double width = scan.nextDouble();
            double area = length * width;
            double perimeter = ((width * 2) + (length * 2));
            System.out.printf("Area: %.2f\n", area);
            System.out.printf("Perimeter: %.2f\n", perimeter);

            System.out.print("Continue? (y/n): ");
            x = scan.next();
        } while (x.equals("y"));
    }
}
