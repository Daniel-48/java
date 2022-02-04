import java.util.InputMismatchException;
import java.util.Scanner;

public class EvenAndOddArrays {
    public static final String BLUE = "\u001B[34m";
    public static final String RESET = "\u001B[0m";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int elements, evenNumbers = 0, oddNumbers = 0;
        int[] array, even, odd;

        try {
            System.out.println("Enter number of array elements:");
            elements = sc.nextInt();
            array = new int[elements];
            for (int i = 0; i < array.length; i++) {
                System.out.println("Enter a whole number");
                array[i] = sc.nextInt();
            }
            System.out.println(BLUE + "Numbers" + RESET);
            for (int i = 0; i < array.length; i++) {
                System.out.print("[" + array[i] + "]");
            }
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 == 0) {
                    evenNumbers++;
                } else {
                    oddNumbers++;
                }
            }
            even = new int[evenNumbers];
            odd = new int[oddNumbers];
            int j = 0, k = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 == 0) {
                    even[j++] = array[i];
                } else {
                    odd[k++] = array[i];
                }
            }
            System.out.println(BLUE + "\nEven numbers" + RESET);
            for (int i = 0; i < even.length; i++) {
                System.out.println("even[" + i + "] = " + even[i]);
            }
            System.out.println(BLUE + "Odd numbers" + RESET);
            for (int i = 0; i < odd.length; i++) {
                System.out.println("odd[" + i + "] = " + odd[i]);
            }
        } catch (InputMismatchException e) {
            System.out.println("You must enter a numeric value");
            main(args);
            System.exit(0);
        }
    }
}
