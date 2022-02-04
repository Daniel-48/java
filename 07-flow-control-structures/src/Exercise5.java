import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * The following survey is to be carried out via computer:
 * - People who have or do not have television.
 * - People who have a smart TV.
 * - People who are thinking of buying a television.
 * Make an algorithm that calculates the percentage of the three groups.
 */

/**
 * A través del ordenador se desea realizar la siguiente encuesta:
 * - Personas que tienen o no televisión.
 * - Personas que tienen smart TV.
 * – Personas que piensan comprarse televisor.
 * Realizar un algoritmo que calcule el tanto por ciento de los tres grupos.
 */

public class Exercise5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        double totalNumberOfUsers, average;
        DecimalFormat df = new DecimalFormat("#.00");

        try {
            System.out.println("Enter the number of people who have or do not have a TV:");
            a = sc.nextInt();
            System.out.println("Enter the number of people who have a smart TV:");
            b = sc.nextInt();
            System.out.println("Enter the number of people planning to buy a TV:");
            c = sc.nextInt();
            sc.close();
            totalNumberOfUsers = a + b + c;
            average = (a * 100) / totalNumberOfUsers;
            System.out.print("Percentage of people who have or do not have television: " + df.format(average) + "%");
            average = (b * 100) / totalNumberOfUsers;
            System.out.print("\nPercentage of people who have smart television: " + df.format(average) + "%");
            average = (c * 100) / totalNumberOfUsers;
            System.out.print("\nPercentage of people who plan to buy a television: " + df.format(average) + "%");
        } catch (InputMismatchException e) {
            System.out.println("You must enter a numeric value");
            main(args);
            System.exit(0);
        }
    }
}
