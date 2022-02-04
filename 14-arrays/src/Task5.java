import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Make a program that goes through an array and generates a histogram based on its values.
 * The array must contain 12 elements corresponding to integers ranging from 1 to 6.
 * A histogram is a graphical dot or bar representation of how much an element appears in a data set,
 * in other words it should show the frequency for all numbers from 1 to 6, even if they are not present in the array.
 * For example for the array {4, 3, 4, 4, 6, 6, 6, 4, 4, 1, 4, 5, 4, 4, 1, 1} the histogram should be:
 * 1: ***
 * 2:
 * 3: *
 * 4: *****
 * 5: *
 * 6: **
 * For the task we will use the asterisk(*) as the graphical representation for the histogram.
 */

/**
 * Hacer un programa que recorra un arreglo y genere un histograma con base en los valores de este.
 * El array debe contener 12 elementos que corresponden a números enteros de rango 1 al 6.
 * Un histograma es una representación gráfica (de puntos o barra) de que tanto un elemento aparece en un conjunto de datos,
 * es decir debe mostrar la frecuencia para todos los números del 1 al 6, incluso si no están presente en el arreglo.
 * Por ejemplo para el arreglo {4, 3, 4, 6, 6, 4, 1, 4, 5, 4, 1, 1} el histograma debería ser:
 * 1: ***
 * 2:
 * 3: *
 * 4: *****
 * 5: *
 * 6: **
 * Para la tarea usaremos el asterisco(*) como representación gráfica para el histograma.
 */

public class Task5 {
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String RESET = "\u001B[0m";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] values = new int[12];

        try {
            System.out.println(YELLOW + "Enter twelve numbers between 1 and 6" + RESET);
            for (int i = 0; i < values.length; i++) {
                do {
                    System.out.print("Enter a number: ");
                    values[i] = sc.nextInt();
                    if (values[i] < 1 || values[i] > 6) {
                        System.out.println(RED + "You must enter a number between 1 and 6" + RESET);
                    }
                } while (values[i] < 1 || values[i] > 6);
            }
            String[] histogram = new String[6];

            for (int i = 0; i < histogram.length; i++) {
                int aux = i + 1;
                String h = aux + ": ";
                for (int j = 0; j < values.length; j++) {
                    if (aux == values[j]) {
                        h += "*";
                    }
                }
                histogram[i] = h;
            }

            // Show histogram
            System.out.println(GREEN + "Solution with twelve elements and a horizontal histogram" + RESET);
            for (int i = 0; i < histogram.length; i++) {
                System.out.println(histogram[i]);
            }
        } catch (InputMismatchException e) {
            System.out.println(RED + "You must enter a numeric value" + RESET);
            System.exit(-1);
        }

        // Solution without limit of elements and with vertical histogram
        int number, max = 0;
        int elements[] = new int[7];
        boolean stop = false;

        try {
            System.out.println(YELLOW + "Enter numbers between 1 and 6\nIf you want to stop enter a negative number" + RESET);
            while (!stop) {
                System.out.print("Enter a number: ");
                number = sc.nextInt();
                if (number >= 1 && number <= 6) {
                    elements[number]++;
                    if (elements[number] > max) {
                        max = elements[number];
                    }
                } else if (number == 0 || number > 6) {
                    System.out.println(RED + "Enter numbers between 1 and 6\nIf you want to stop enter a negative number" + RESET);
                } else {
                    stop = true;
                }
            }
            System.out.println(GREEN + "Solution without limit of elements and with vertical histogram" + RESET);
            historyChart(elements, max);
        } catch (InputMismatchException e) {
            System.out.println(RED + "You must enter a numeric value" + RESET);
            System.exit(-1);
        }
        sc.close();
    }

    // Function to make the histogram
    public static void historyChart(int[] v, int max) {
        for (int i = max; i > 0; i--) {
            for (int j = 1; j < v.length; j++) {
                if (v[j] >= i) {
                    System.out.print("* ");

                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for (int i = 1; i < 7; i++) {
            System.out.printf("%d ", i);
        }
    }
}
