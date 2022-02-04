import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

/**
 * A poll is going to be carried out for the votes, so that a vote or don't vote message comes out, depending on whether you are eighteen years old, counting those who vote.
 * By asking for the date of birth and the date of voting, an algorithm will be created to resolve this situation.
 */

/**
 * Se va a realizar un sondeo para las votaciones, de manera que salga un mensaje de votar o no votar, dependiendo de si se tiene o no dieciocho años, contando los que votan.
 * Al pedir la fecha de nacimiento y la fecha de votación, se creará un algoritmo para resolver esta situación.
 */

public class Exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String f1 = null, f2 = null;
        LocalDate dateOfBirth = null, votingDate = null;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        try {
            System.out.println("Enter date of birth (dd-MM-yyyy):");
            f1 = sc.nextLine();
            dateOfBirth = LocalDate.parse(f1, formatter);
            System.out.println("Enter voting date (dd-MM-yyyy):");
            f2 = sc.nextLine();
            votingDate = LocalDate.parse(f2, formatter);
        } catch (DateTimeParseException e) {
            System.out.println("Incorrect date format");
            main(args);
            System.exit(0);
        }
        System.out.println("Date of birth: " + f1);
        System.out.println("Voting date: " + f2);
        Period age = Period.between(dateOfBirth, votingDate);
        System.out.printf("Your age is: %s years, %s months and %s days",
                age.getYears(), age.getMonths(), age.getDays());
        if (age.getYears() >= 18) {
            System.out.println("\nYou can vote");
        } else {
            System.out.println("\nYou can't vote");
        }
    }
}
