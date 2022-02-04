import java.util.InputMismatchException;
import java.util.Scanner;

public class MovePositionInArray3 {
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
            int element, index, last;
            for (int i = 0; i < numbers.length; i++) {
                System.out.print("Enter a number at index[" + i + "]: ");
                numbers[i] = sc.nextInt();
            }
            // Original Array
            System.out.println(BLUE + "Original array" + RESET);
            for (int i = 0; i < numbers.length; i++) {
                System.out.println("numbers[" + i + "] = " + numbers[i]);
            }
            System.out.println("Enter a new element:");
            element = sc.nextInt();
            System.out.println("Enter the index to where to add the new element from 0 to " + (numbers.length-1) + ":");
            index = sc.nextInt();
            last = numbers[numbers.length-1];
            for (int i = numbers.length-2; i >= index; i--) {
                numbers[i+1] = numbers[i];
            }
            int[] newArray = new int[numbers.length+1];
            System.arraycopy(numbers,0,newArray,0,numbers.length);
            newArray[index] = element;
            newArray[newArray.length-1] = last;
            System.out.println(BLUE + "New array" +  RESET);
            for (int i = 0; i < newArray.length; i++) {
                System.out.println("numbers[" + i + "] = " + newArray[i]);
            }
        } catch (InputMismatchException e) {
            System.out.println(RED + "You must enter a numeric value" + RESET);
            main(args);
            System.exit(0);
        }
        sc.close();
    }
}
