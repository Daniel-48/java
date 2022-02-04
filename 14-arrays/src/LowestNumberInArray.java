import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Make a program with the following requirements:
 * 1. Enter by keyboard the length of the array
 * 2. Fill the array with whole numbers entered by keyboard
 * 3. Show the array
 * 4. Find and display the lowest number in the array
 */

/**
 * Hacer un programa con los siguientes requisitos:
 * 1. Introducir por teclado la longitud del array
 * 2. Rellenar el array con números enteros introducidos por teclado
 * 3. Mostrar el array
 * 4. Encontrar y mostrar el número más bajo del array
 */

public class LowestNumberInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int elements;

        try {
            System.out.println("Enter number of array elements:");
            elements = sc.nextInt();
            int[] array = new int[elements];
            for (int i = 0; i < array.length; i++) {
                System.out.println("Enter a whole number:");
                array[i] = sc.nextInt();
            }
            System.out.println("Numbers");
            for (int i = 0; i < array.length; i++) {
                System.out.print("[" + array[i] + "]");
            }
            int min = array[0];
            for (int i = 0; i < array.length; i++) {
                if (array[i] < min) {
                    min = array[i];
                }
            }
            System.out.println("\nThe lowest number is " + min);
        } catch (InputMismatchException e) {
            System.out.println("You must enter a numeric value");
            main(args);
            System.exit(0);
        }
        sc.close();

    }
}
