import java.util.InputMismatchException;
import java.util.Scanner;

public class MovePositionInArray1 {
    public static final String RED = "\u001B[31m";
    public static final String BLUE = "\u001B[34m";
    public static final String RESET = "\u001B[0m";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfElements;

        try {
            System.out.println("Enter number of elements in array:");
            numberOfElements = sc.nextInt();
            int[] numbers = new int[numberOfElements];
            int last;
            for (int i = 0; i < numbers.length; i++) {
                System.out.print("Enter a number at index[" + i + "]: ");
                numbers[i] = sc.nextInt();
            }
            // Original Array
            System.out.println(BLUE + "Original array" + RESET);
            for (int i = 0; i < numbers.length; i++) {
                System.out.println("numbers[" + i + "] = " + numbers[i]);
            }
            // Move one position
            last = numbers[numbers.length-1];
            for (int i = numbers.length-2; i >= 0; i--) {
                numbers[i+1] = numbers[i];
            }
            numbers[0] = last;
            System.out.println(BLUE + "Modified array" +  RESET);
            for (int i = 0; i < numbers.length; i++) {
                System.out.println("numbers[" + i + "] = " + numbers[i]);
            }
        } catch (InputMismatchException e) {
            System.out.println(RED + "You must enter a numeric value" + RESET);
            main(args);
            System.exit(0);
        }
        sc.close();
    }
}
