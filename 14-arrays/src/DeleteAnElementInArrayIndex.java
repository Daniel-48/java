import java.util.InputMismatchException;
import java.util.Scanner;

public class DeleteAnElementInArrayIndex {
    public static final String RED = "\u001B[31m";
    public static final String BLUE = "\u001B[34m";
    public static final String RESET = "\u001B[0m";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[6];

        try {
            for (int i = 0; i < numbers.length; i++) {
                System.out.print("Enter a number at index [" + i + "]: ");
                numbers[i] = sc.nextInt();
            }
            System.out.println("Enter the index of the item to be deleted between 0 and " + (numbers.length-1) +":");
            int index = sc.nextInt();
            for (int i = index; i < numbers.length-1; i++) {
                numbers[i] = numbers[i+1];
            }
            System.out.println(BLUE + "New array" + RESET);
            int[] newArray = new int[numbers.length-1];
            System.arraycopy(numbers,0,newArray,0,newArray.length);
            for (int i = 0; i < newArray.length; i++) {
                System.out.println("numbers[" + i + "] = " + newArray[i]);
            }
        } catch (InputMismatchException e) {
            System.out.println(RED + "You must enter a numeric value" + RESET);
        }
        sc.close();
    }
}
