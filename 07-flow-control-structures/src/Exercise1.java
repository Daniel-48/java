import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Given a number N, answer whether it is a multiple of 3, 6 and 9 at the same time. This operation is to be carried out an indefinite number of times.
 */

/**
 * Dado un número N, contestar si es múltiplo de 3, 6 y 9 a la vez. Esta operación se desea realizarla un número indefinido de veces.
 */
public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 0;
        String more;
        System.out.println("Enter a number to find out if it is a multiple of 3, 6 and 9 at the same time.");

        do {
            try {
                System.out.println("Enter a number:");
                number = sc.nextInt();
                sc.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("You must enter a numeric value");
                main(args);
                System.exit(0);
            }
            if (number % 3 == 0 && number % 6 == 0 && number % 9 == 0) {
                System.out.println("The number " + number + " is a multiple of 3, 6 and 9.");
            }
            else {
                System.out.println("The number " + number + " isn't multiple of 3, 6 and 9.");
            }
            do {
                System.out.println("Do you want to enter another number? (Yes/No):");
                more = sc.nextLine();
                if (!more.equalsIgnoreCase("Yes") && !more.equalsIgnoreCase("No")) {
                    System.out.println("You must enter yes or no");
                    System.out.println("Do you want to enter another number? (Yes/No):");
                    more = sc.nextLine();
                }
            } while (!more.equalsIgnoreCase("Yes") && !more.equalsIgnoreCase("No"));
        } while (more.equalsIgnoreCase("Yes"));
        sc.close();
    }
}
