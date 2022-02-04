import java.util.InputMismatchException;
import java.util.Scanner;

public class IfElseFlowControlStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = 0, month = 0, numberOfDays = 0;
        float average = 8.7f;

        System.out.println("Average = " + average);

        if (average < 5) {
            System.out.println("Insufficient average");
        } else if(average >= 5 && average < 6) {
            System.out.println("Sufficient average");
        } else if (average >= 6 && average < 7) {
            System.out.println("Good average");
        } else if (average >= 7 && average < 9) {
            System.out.println("Very good average");
        } else if (average >= 9) {
            System.out.println("Excellent average");
        }

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

        if (month == 1 || month == 3  || month == 5 || month == 7 | month == 8 || month == 10 || month == 12) {
            numberOfDays = 31;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            numberOfDays = 30;
        } else if (month == 2) {
            if (year % 100 == 0 || (year % 4 == 0 && !(year % 100 == 0))) {
                numberOfDays = 29;
                System.out.println("Is a leap year");
            } else {
                numberOfDays = 28;
                System.out.println("Isn't a leap year");
            }
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
