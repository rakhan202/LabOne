/**
 * Created by rizwan khan on 6/17/2017.
 */
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
import java.text.SimpleDateFormat;
import java.time.temporal.ChronoUnit;

class DiffDatesFinder {

    public static void main(String[] args) {

        //prompts user for date input
        System.out.println("Enter any date in YYYY-MM-DD format:");

        //creates new scanner object
        Scanner scan = new Scanner(System.in);

        //inputs user date as String
        String dateOneString = scan.nextLine();

        //parses first date using local date format
        LocalDate dateOne = LocalDate.parse(dateOneString);

        //prompts user for second date
        System.out.println("Enter a second date, must occur after first date given. Use YYYY-MM-DD format: ");

        //inputs user date into scanner object
        Scanner scan2 = new Scanner(System.in);

        //converts user date into String
        String dateTwoString = scan2.nextLine();

        //parses second date into LocalDate format
        LocalDate dateTwo = LocalDate.parse(dateTwoString);

        //Gets the difference between two dates using ChronoUnit.between method in the Period class
        Period difference = dateOne.until(dateTwo);

        //Uses Period class to get difference in days, months, years
        int days = difference.getDays();
        int months = difference.getMonths();
        int years = difference.getYears();

        //Outputs difference in time in days, months, years
        System.out.println("Your time difference is: " + months + " Months, " + days + " Days, and " + years + " Years.");
    }
}