import java.util.InputMismatchException;
import java.util.Scanner;

public class SwitchCaseNumberOfDaysInMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = 0, month = 0, numberOfDays = 0;

        try {
            do {
                System.out.println("Enter a year:");
                year = sc.nextInt();
                System.out.println("Enter a month:");
                month = sc.nextInt();
                if (year < 1582 || year > 2022) {
                    System.out.println("It's not a valid year the year must be between 1582 and 2022 both included");
                }
                if (month < 1 || month > 12) {
                    System.out.println("The value of the variable month must be between 1 and 12, both included");
                }
            } while (year < 1582 || year > 2022 && month > 0 || month > 12);
        } catch (InputMismatchException e) {
            System.out.println("Error! You must enter a numeric value");
            System.exit(0);
        }

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numberOfDays = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numberOfDays = 30;
                break;
            case 2:
                if (year % 100 == 0 || (year % 4 == 0 && !(year % 100 == 0))) {
                    numberOfDays = 29;
                    System.out.println("Is a leap year");
                } else {
                    numberOfDays = 28;
                    System.out.println("Isn't a leap year");
                }
                break;
            default:
                numberOfDays = 0;
                break;
        }

        sc.close();
        System.out.println("Year = " + year);
        System.out.println("Month = " + month);

        if (month == 1) {
            System.out.println("January has " +  numberOfDays + " days");
        } else if (month == 2) {
            System.out.println("February has " + numberOfDays + " days");
        } else if (month == 3) {
            System.out.println("March has " + numberOfDays + " days");
        } else if (month == 4) {
            System.out.println("April has " + numberOfDays + " days");
            System.out.println("Our son Gael will be born in April");
        } else if (month == 5) {
            System.out.println("May has " + numberOfDays + " days");
        } else if (month == 6) {
            System.out.println("June has " + numberOfDays + " days");
        } else if (month == 7) {
            System.out.println("July has " + numberOfDays + " days");
        } else if (month == 8) {
            System.out.println("August has " + numberOfDays + " days");
        } else if (month == 9) {
            System.out.println("September has " + numberOfDays + " days");
        } else if (month == 10) {
            System.out.println("October has " + numberOfDays + " days");
        } else if (month == 11) {
            System.out.println("November has " + numberOfDays + " days");
        } else if (month == 12) {
            System.out.println("December has " + numberOfDays + " days");
        }
    }
}
