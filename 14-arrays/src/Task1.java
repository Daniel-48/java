import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Read 10 integers from the keyboard to fill an array with 10 elements.
 * Then display them in the following order: last, first, second to last, second to last, second to last, third, and so on.
 */


/**
 * Leer 10 números enteros desde el teclado para llenar un arreglo de 10 elementos.
 * Luego mostrarlos en el siguiente orden: el último, el primero, el penúltimo, el segundo, el antepenúltimo, el tercero, y así sucesivamente.
 */

public class Task1 {
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String RESET = "\u001B[0m";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfElements;

        try {
            System.out.println("Enter the number of elements in array:");
            numberOfElements = sc.nextInt();
            int[] numbers = new int[numberOfElements];
            int i;
            for (i = 0; i < numbers.length; i++) {
                System.out.print("Enter a number at index [" + i + "]: ");
                numbers[i] = sc.nextInt();
            }
            System.out.println(GREEN + "Original array" + RESET);
            for (i = 0; i < numbers.length; i++) {
                System.out.println("numbers[" + i + "] = " + numbers[i]);
            }
            System.out.println(GREEN + "Modified array" + RESET);
            for (i = 0; i < numbers.length/2; i++) {
                System.out.println("numbers[" + i + "] = " + numbers[i]);
                System.out.println("numbers[" + i + "] = " + numbers[numbers.length-1-i]);
            }
        } catch (InputMismatchException e) {
            System.out.println(RED + "You must enter a numeric value" + RESET);
        }
        sc.close();
    }
}
