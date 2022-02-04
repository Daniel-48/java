import java.util.InputMismatchException;
import java.util.Scanner;

public class FindNumberInArray {
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String RESET = "\u001B[0m";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int elements;

        try {
            elements = readPositiveNumber("Enter the number of elements in the array:");
            int[] numbers = new int[elements];
            for (int i = 0; i < numbers.length; i++) {
                System.out.print("Enter number in index [" + i + "]: ");
                numbers[i] = sc.nextInt();
            }
            System.out.println("Enter the number to search for in the array:");
            int number = sc.nextInt();
            int i = 0;
            while (i < numbers.length && numbers[i] != number) {
                i++;
            }
            if (i == numbers.length) {
                System.out.println(RED + "The number " + number + " has not been found in the array" + RESET);
            } else if(numbers[i] == number) {
                System.out.println(GREEN + "The number " + number + " has been found in the array in the index " + i + RESET);
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
