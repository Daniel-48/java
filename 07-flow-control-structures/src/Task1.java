import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Create a class with the main method where the challenge is to find the smallest number of minimum 10 integer values,
 * using the Scanner class enter the amount of numbers to compare, then using a for statement iterate the number of times (entered) to ask for the integer, then it is required:
 * Calculate the smallest number and print the value.
 * If the smallest number is less than 10, print "The smallest number is less than 10!". otherwise, print "The smallest number is equal to or greater than 10!"
 */

/**
 * Crear una clase con el método main donde el desafío es buscar el número menor de mínimo 10 valores enteros,
 * usando la clase Scanner ingresar la cantidad de números a comparar, luego utilizando una sentencia for iterar el número de veces (ingresado) para pedir el número entero, entonces se requiere:
 * Calcular el menor número e imprimir el valor.
 * Si el menor número es menor que 10, imprimir "¡El número menor es menor que 10!". Si no, imprimir "¡El número menor es igual o mayor que 10!"
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quantity = 0;

        do {
            try {
                System.out.println("Enter the quantity of numbers to compare:");
                quantity = sc.nextInt();
                if (quantity < 10) {
                    System.out.println("The quantity of numbers to be compared can't be less than ten");
                }
            } catch (InputMismatchException e) {
                System.out.println("You must enter a numeric value");
                main(args);
                System.exit(0);
            }
        } while (quantity < 10);

        int number, smallerNumber;
        int[] numbers = new int[quantity];

        try {
            for (int i = 0; i < numbers.length; i++) {
                System.out.println("Enter a number:");
                number = sc.nextInt();
                numbers[i] = number;
            }
        } catch (InputMismatchException e) {
            System.out.println("You must enter a numeric value");
            System.exit(0);
        }

        sc.close();

        smallerNumber = numbers[0];

        System.out.println("The numbers to compare entered are:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("[" + numbers[i] + "]");
        }

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < smallerNumber) {
                smallerNumber = numbers[i];
            }
        }

        if (smallerNumber < 10) {
            System.out.println("\nThe smallest number is " + smallerNumber);
            System.out.println("The smaller number is less than 10!");
        } else {
            System.out.println("\nThe smallest number is " + smallerNumber);
            System.out.println("The smallest number is equal to or greater than 10!");
        }
    }
}
