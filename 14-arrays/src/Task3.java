import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * Read 7 numbers by keyboard to fill an array and then calculate the average of the positive numbers,
 * the average of the negative numbers and count the number of zeros.
 */

/**
 * Lee 7 números por teclado para llenar una matriz y luego calcula la media de los números positivos,
 * la media de los números negativos y cuenta el número de ceros.
 */

public class Task3 {
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String RESET = "\u001B[0m";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        int counter = 0, sumPositiveNumbers = 0, sumNegativeNumbers = 0;
        double average1, average2;
        int[] numbers = new int[7];
        List<Integer> positiveList = new ArrayList<>();
        List<Integer> negativeList = new ArrayList<>();

        try {
            for (int i = 0; i < numbers.length; i++) {
                System.out.print("Enter a number at index [" + i +"]: ");
                numbers[i] = sc.nextInt();
                if (numbers[i] > 0) {
                    positiveList.add(numbers[i]);
                    sumPositiveNumbers += numbers[i];
                }
                if (numbers[i] < 0) {
                    negativeList.add(numbers[i]);
                    sumNegativeNumbers += numbers[i];
                }
                if (numbers[i] == 0) {
                    counter++;
                }
            }
            // Original Array
            System.out.println(GREEN + "Array" + RESET);
            for (int i = 0; i < numbers.length; i++) {
                System.out.println("numbers[" + i + "] = " + numbers[i]);
            }
            // Positive numbers array
            System.out.println(GREEN + "Positive number array" + RESET);
            int[] positives = new int[positiveList.size()];
            for (int i = 0; i < positiveList.size(); i++) {
                positives[i] = positiveList.get(i);
            }
            for (int i = 0; i < positives.length; i++) {
                System.out.println("positives[" + i + "] = " + positives[i]);
            }
            System.out.println("The sum of the positive numbers is: " +  sumPositiveNumbers);
            average1 = (double) sumPositiveNumbers/positives.length;
            System.out.println("The average of the positive numbers is: " + df.format(average1));
            // Negative numbers array
            System.out.println(GREEN + "Negative number array" + RESET);
            int[] negatives = new int[negativeList.size()];
            for (int i = 0; i < negativeList.size(); i++) {
                negatives[i] = negativeList.get(i);
            }
            for (int i = 0; i < negatives.length; i++) {
                System.out.println("negatives[" + i + "] = " + negatives[i]);
            }
            System.out.println("The sum of the negative numbers is: " +  sumNegativeNumbers);
            average2 = (double) sumNegativeNumbers/negatives.length;
            System.out.println("The average of the negative numbers is: " + df.format(average2));
            // Number of zeros
            System.out.println(GREEN + "Number of zeros" + RESET);
            System.out.println("Number of zeros: " +  counter);
        } catch (InputMismatchException e) {
            System.out.println(RED + "You must enter a numeric value");
        }
        sc.close();
    }
}
