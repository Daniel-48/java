import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * Design the algorithm of a program that:
 * 1. Ask for a number (integer data) by keyboard.
 * 2. Repeat step 1 indefinitely until the user decides to stop.
 * 3. Display how many prime numbers have been entered by the user.
 */

/**
 * Diseñar el algoritmo de un programa que:
 * 1. Pida un número (dato entero) por teclado.
 * 2. Repita el paso 1 indefinidamente hasta que el usuario decida parar.
 * 3. Mostrar cuántos números primos ha introducido el usuario.
 */

public class Exercise8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, index = 0;
        List<Integer> numbers = new ArrayList<>();
        List<Integer> primes = new ArrayList<>();
        try {
            do {
                System.out.println("Enter a number or enter zero to exit:");
                number = sc.nextInt();
                numbers.add(number);
                if (isPrime(number)) {
                    primes.add(number);
                }
                index = primes.size()-1;
            } while (number != 0);
        } catch (InputMismatchException e) {
            System.out.println("You must enter a numeric value");
            main(args);
            System.exit(0);
        }
        sc.close();
        System.out.println("The numbers entered are:");
        System.out.print(numbers);
        primes.remove(index);
        System.out.println("\nThe prime numbers are:");
        System.out.print(primes);
    }

    // Function to calculate if a number is prime.
    public static boolean isPrime(int number) {
        boolean prime = true;
        // Double condition [i < number && prime] in case it finds a prime number
        // We start the counter at 2 because the number 1 is known to be prime
        for (int i = 2; i < number && prime; i++) {
            /**
             * We use the counter to divide the number by all the numbers from 1 up to the number
             * by all the numbers from 1 to reach the number.
             * Example (5) (5/2, 5/3, 5/4 and 5/5)
             */
            if (number % i == 0) prime = false;
        }
        return prime;
    }
}
