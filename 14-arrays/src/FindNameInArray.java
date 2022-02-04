import java.util.InputMismatchException;
import java.util.Scanner;

public class FindNameInArray {
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String RESET = "\u001B[0m";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int elements;

        try {
            elements = readPositiveNumber("Enter the number of elements in the array:");
            String[] array = new String[elements];
            for (int i = 0; i < array.length; i++) {
                System.out.print("Enter a name in index [" + i + "]: ");
                array[i] = sc.next();
            }
            System.out.println("Enter the name to search for in the array:");
            String name = sc.next();
            int i = 0;
            while (i < array.length && !array[i].equalsIgnoreCase(name)) {
                i++;
            }
            if (i == array.length) {
                System.out.println("The name " + GREEN + "'" + name + "'" + RESET + " has not been found in the array");
            } else if(array[i].equalsIgnoreCase(name)) {
                System.out.println("The name " + GREEN + "'" + name + "'" + RESET +  " has been found in the array in the index " + i + RESET);
            }
        } catch (InputMismatchException e) {
            System.out.println(RED + "You must enter a numeric value" + RESET);
            main(args);
            System.exit(0);
        }
        sc.close();
    }
    private static int readPositiveNumber(String message) {
        Scanner sc = new Scanner(System.in);
        int number;

        do {
            System.out.println(message);
            number = sc.nextInt();
        } while (number <= 0);

        return number;
    }
}
