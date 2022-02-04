import java.util.InputMismatchException;
import java.util.Scanner;

public class DetectArrayOrder {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int elements;
        boolean ascending = false;
        boolean descending = false;
        try {
            System.out.println("Enter number of array elements:");
            elements = sc.nextInt();
            int[] array = new int[elements];
            for (int i = 0; i < array.length; i++) {
                System.out.println("Enter a number:");
                array[i] = sc.nextInt();
            }

            for (int i = 0; i < array.length -1; i++) {
                if (array[i] > array[i+1]) {
                    descending = true;
                }
                if (array[i] < array[i+1]) {
                    ascending = true;
                }
            }
            if (ascending == true && descending == true) {
                System.out.println("The array is out of order");
            }
            if (ascending == false && descending == false) {
                System.out.println("The elements of the array are all the same");
            }
            if (ascending == true && descending == false) {
                System.out.println("The array is sorted in ascending order");
            }
            if (ascending == false && descending == true) {
                System.out.println("The array is sorted in descending order");
            }
        } catch (InputMismatchException e) {
            System.out.println("You must enter a numeric value");
            main(args);
            System.exit(0);
        }
        sc.close();
    }
}
