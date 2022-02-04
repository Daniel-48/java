import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * For the task you must create an array with 10 elements (integers in the range 1 to 9).
 * Make a program that prints the number that has the most occurrences in the array and also prints the number of times it appears in the array.
 * For example, for the array: {1,2,3,3 3,4,4,5,5,5,5,6,7}
 * As a result it should print the following:
 * The most occurrences is: 3
 * The most repeated element is: 5
 * In the example, the most repeated element in the array is the number 5 with an occurrence of 3 times.
 */

/**
 * Para la tarea se debe crear un array con 10 elementos (enteros en el rango de 1 a 9).
 * Hacer un programa que imprima el número que tiene más ocurrencias en el arreglo y también imprimir la cantidad de veces que aparece en el array.
 * Por ejemplo, para el array: {1,2,3,3,4,5,5,5,6,7}
 * Como resultado debería imprimir lo siguiente:
 * La mayor ocurrencia es: 3
 * El elemento que más se repite es: 5
 * En el ejemplo, el elemento que más se repite en el arreglo es el número 5 con una ocurrencia de 3 veces.
 */

public class Task4 {
    public static final String RED = "\u001B[31m";
    public static final String RESET = "\u001B[0m";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];

        try {
            System.out.println("Enter ten numbers between 1 and 9");
            for (int i = 0; i < numbers.length; i++) {
                do {
                    System.out.print("Enter a number at index [" + i +"]: ");
                    numbers[i] = sc.nextInt();
                    if (numbers[i] < 1 || numbers[i] > 9) {
                        System.out.println(RED + "You must enter a number between 1 and 9" + RESET);
                    }
                } while (numbers[i] < 1 || numbers[i] > 9);
            }
            int[] array = new int[10];
            for (int i = 0; i < numbers.length; i++) {
                int timesRepeated = 0;
                for (int j = 0; j < numbers.length; j++) {
                    if (numbers[i] == numbers[j]) {
                        timesRepeated++;
                    }
                }
                array[i] = timesRepeated;
            }
            int index = 0, mostRepeated = 0;
            for (int i = 0; i < 10; i++) {
                if (mostRepeated < array[i]) {
                    mostRepeated = array[i];
                    index = i;
                }
            }
            System.out.println("\nThe most occurrences is: " + mostRepeated);
            System.out.println("The most repeated element is: " + numbers[index]);
        } catch (InputMismatchException e) {
            System.out.println(RED + "You must enter a numeric value" + RESET);
        }
        sc.close();
    }
}
