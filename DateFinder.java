/**
 * Created by rizwa on 6/17/2017.
 */
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
import java.text.SimpleDateFormat;
import java.time.temporal.ChronoUnit;

class DiffbtwDates {

    public static void main(String[] args) {

        System.out.print("Enter any date in YYYY-MM-DD format:");

        Scanner scanner = new Scanner(System.in);

        String dateOneString = scanner.nextLine();

        LocalDate dateOne = LocalDate.parse(dateOneString);

        System.out.println("Enter a second date, so long as it falls after the first date entered. (Use YYYY-MM-DD format: ");

        Scanner scanner2 = new Scanner(System.in);

        String dateTwoString = scanner2.nextLine();

        LocalDate dateTwo = LocalDate.parse(dateTwoString);

        Period difference = dateOne.until(dateTwo);

        int days = difference.getDays();
        int months = difference.getMonths();
        int years = difference.getYears();
        scanner.close();

        System.out.println("Your time difference is: " + months + " Months, " + days + " Days, and " + years + " Years.");
    }
}