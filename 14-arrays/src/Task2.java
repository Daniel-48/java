import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Make a program that prints the highest number in an array of 7 elements (range 11 to 99)
 * For example {14, 33, 15, 36, 78, 21, 43}, if a value is repeated consider only one.
 */

/**
 * Hacer un programa que imprima el número más alto de un arreglo de 7 elementos (de rango 11 a 99)
 * Por ejemplo {14, 33, 15, 36, 78, 21, 43}, si se repite un valor considerar uno solo.
 */

public class Task2 {
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String RESET = "\u001B[0m";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int highestNumber, biggerNumber;
        int[] randomNumbers = new int[7];
        int[] numbers = new int[7];

        try {
            // Array filled with random numbers
            for (int i = 0; i < randomNumbers.length; i++) {
                randomNumbers[i] = (int)(Math.random()*(99-11+1)+11);
            }
            System.out.println(GREEN + "Array of random numbers between 11 and 99" + RESET);
            for (int i = 0; i < randomNumbers.length; i++) {
                System.out.println("randomNumbers[" + i +"] = " + randomNumbers[i]);
            }
            // Get the highest number in the array
            highestNumber = randomNumbers[0];
            for (int i = 0; i < randomNumbers.length; i++) {
                if (randomNumbers[i] > highestNumber) {
                    highestNumber = randomNumbers[i];
                }
            }
            System.out.println("The highest number is " + highestNumber);

            // Array filled with numbers read from the keyboard
            // Read numbers by keyboard
            System.out.println(GREEN + "Read numbers by keyboard" + RESET);
            for (int i = 0; i < numbers.length; i++) {
                do {
                    System.out.print("Enter a number at index [" +  i + "]: ");
                    numbers[i] = sc.nextInt();
                    if (numbers[i] < 11 || numbers[i] > 99) {
                        System.out.println(RED + "The number entered must be between 11 and 99 both included" + RESET);
                    }
                } while (numbers[i] < 11 || numbers[i] > 99);
            }
            System.out.println(GREEN + "Array of numbers entered by keyboard" + RESET);
            for (int i = 0; i < numbers.length; i++) {
                System.out.println("numbers[" + i +"] = " + numbers[i]);
            }
            // Get the highest number in the array
            biggerNumber = numbers[0];
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] > biggerNumber) {
                    biggerNumber = numbers[i];
                }
            }
            System.out.println("The highest number is " + biggerNumber);
        } catch (InputMismatchException e) {
            System.out.println(RED  + "You must enter a numeric value" + RESET);
        }
        sc.close();
    }
}
