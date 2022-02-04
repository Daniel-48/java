import java.util.InputMismatchException;
import java.util.Scanner;

public class MovePositionInSortedArray {
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
            int element, index;
            for (int i = 0; i < numbers.length-1; i++) {
                System.out.print("Enter a number at index[" + i + "]: ");
                numbers[i] = sc.nextInt();
            }
            /**
             * Adding an element in an appropriate position so that it's keep sorted
             * Example:
             * int[] numbers = {15, 17, 19, 23, 25, 27};
             * element = 21
             */
            System.out.println(BLUE + "Enter a number:" + RESET);
            element = sc.nextInt();
            index = 0;
            while (index < numbers.length-1 && element > numbers[index]) {
              index++;
            }
            for (int i = numbers.length-2; i >= index; i--) {
                numbers[i+1] = numbers[i];
            }
            numbers[index] = element;
            System.out.println(BLUE + "Sorted array" + RESET);
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
