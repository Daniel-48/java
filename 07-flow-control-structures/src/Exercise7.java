import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Design the algorithm of a program that:
 * 1. Ask by keyboard for a number (integer data).
 * 2. Repeat step 1, as long as the number entered is non-zero.
 * Show how many numbers greater than zero have been entered by the user, as well as the sum of all of them.
 */

/**
 * Diseñar el algoritmo de un programa que:
 * 1. Pida por teclado un número (dato entero).
 * 2. Repita el paso 1, mientras que, el número introducido sea distinto de cero.
 * 3. Muestre cuántos números mayores que cero han sido introducidos por el usuario, así como, la suma de todos ellos.
 */

public class Exercise7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, total = 0, counter = 0;
        List numbers = new ArrayList<>();

        System.out.println("Enter a number:");
        do {
            number = sc.nextInt();
            numbers.add(number);
            if (number != 0) {
                System.out.println("Enter another number, enter zero to exit");
                counter++;
            }
            total += number;
        } while (number != 0);
        sc.close();
        System.out.println("The numbers entered are:");
        System.out.print(numbers);
        System.out.println("\nThe amount of numbers greater than zero are: " + counter);
        System.out.println("The sum is: " + total);
    }
}
