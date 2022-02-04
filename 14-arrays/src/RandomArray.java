import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Filling an array with random numbers between 1 and 50.
 * Enter the index of the array and display the value contained in that index.
 */

/**
 * Rellenar una matriz con números aleatorios entre 1 y 50.
 * Introducir el índice del array y mostrar el valor que contiene ese índice.
 */

public class RandomArray {
    public static final String RED = "\u001B[31m";
    public static final String RESET = "\u001B[0m";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfElements, index;

        try {
            do {
                System.out.print("Enter number of elements in array: ");
                numberOfElements = sc.nextInt();
                if (numberOfElements <= 0) {
                    System.out.println(RED + "The array must have at least one element" + RESET);
                }
            } while (numberOfElements <= 0);

            int[] randomArray = new int[numberOfElements];

            for (int i = 0; i < randomArray.length; i++) {
                randomArray[i] = (int) (Math.random() * 50 + 1);
            }
            // Show array
            for (int i = 0; i < randomArray.length; i++) {
                System.out.println("Index [" + i + "] of the array has the number: " + randomArray[i]);
            }

            System.out.println("Enter the index of the array and display the value contained in that index");

            do {
                System.out.print("Enter index between 0 and " + (randomArray.length - 1) + " both included: ");
                index = sc.nextInt();

                // Validate the index number entered
                if (index > randomArray.length - 1) {
                    System.out.println(RED + "Enter a number between 0 and " + (randomArray.length - 1) + " both included" + RESET);
                }
            } while (index > randomArray.length - 1);

            System.out.println("Index [" + index + "] contains the value " + randomArray[index]);
        } catch (InputMismatchException e) {
            System.out.println(RED + "You must enter  a numeric value" + RESET);
        }
    }
}
