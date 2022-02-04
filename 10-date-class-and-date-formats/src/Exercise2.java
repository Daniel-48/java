import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = 0, month = 0, year = 0;

        try {
            System.out.println("Enter your day of birth:");
            day = sc.nextInt();

            System.out.println("Enter your month of birth:");
            month = sc.nextInt();

            System.out.println("Enter your year of birth:");
            year = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("You must enter a numeric value");
            main(args);
            System.exit(0);
        }

        Calendar dateOfBirth = new GregorianCalendar(year, month - 1, day);
        Calendar currentDate = Calendar.getInstance();

        long ageInDays = (currentDate.getTimeInMillis() - dateOfBirth.getTimeInMillis()) / 1000 / 60 / 60 / 24;

        int years = Double.valueOf(ageInDays / 365.25d).intValue();
        int days = Double.valueOf(ageInDays % 365.25d).intValue();

        System.out.println(String.format("You have %d years and %d days", years, days));
    }
}
