import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Ask for 20 final grades of students on a scale from 1 to 7, handle decimals in the grades (double).
 * Show the average of grades higher than 5, average of grades lower than 4 and the number of grades 1, also show the total average.
 * Help: use a for loop that iterates up to 20 (grades) and within the loop ask for the grades one by one to perform the calculations (counters, sums).
 * Optional: if one of the entered grades is 0, exit the for loop and display an error message terminating the program.
 */

/**
 * Pedir 20 notas finales de alumnos en una escala de 1 a 7, manejar decimales en las notas (double).
 * Mostrar el promedio de las notas mayores a 5, promedio de notas inferiores a 4 y la cantidad de notas 1, además mostrar el promedio total.
 * Ayuda: usar un bucle for que itere hasta 20 (notas) y dentro del ciclo pedir las notas una a una para realizar los cálculos (contadores, sumas).
 * Opcional: si una de las notas ingresadas es 0 debe salirse del ciclo for y mostrar un mensaje de error finalizando el programa.
 */

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] grades = new double[20];
        double grade, totalAverage;
        DecimalFormat df = new DecimalFormat("#.00");

        System.out.println("Enter final grades of students on a scale from 1 to 7");
        for (int i = 0; i < grades.length; i++) {
            try {
                do {
                    System.out.println("Enter a grade:");
                    grade = sc.nextDouble();
                    if (grade < 1 || grade > 7) {
                        System.out.println("You must enter a value between 1 and 7 both included");
                    }
                } while (grade < 1 || grade > 7);
                grades[i] = grade;
            } catch (InputMismatchException e) {
                System.out.println("You must enter a numeric value");
                main(args);
                System.exit(0);
            }
        }

        System.out.println("The students final grades are:");

        for (int i = 0; i < grades.length; i++) {
            System.out.print("[" + grades[i] + "]\n");
        }

        // Grade point average above five
        int c1 = 0;
        double gradesHigherFive = 0, averageHigherFive;
        System.out.println("\nFinal grades higher than five");
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] > 5) {
                System.out.print("[" + grades[i] + "]");
                gradesHigherFive += grades[i];
                c1++;
            }
        }
        averageHigherFive = gradesHigherFive / c1;
        System.out.println("\nGrade point average higher than five = " + df.format(averageHigherFive));

        // Grade point average below four
        int c2 = 0;
        double gradesLowerFour = 0, averageLessFour;
        System.out.println("\nFinal grades lower than four");
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] < 4) {
                System.out.print("[" + grades[i] + "]");
                gradesLowerFour += grades[i];
                c2++;
            }
        }
        averageLessFour = gradesLowerFour / c2;
        System.out.println("\nGrade point average lower than four = " + df.format(averageLessFour));

        // Number of grades 1
        int numberOfGrades = 0;
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] == 1) {
                numberOfGrades++;
            }
        }
        System.out.println("\nNumber of grades equal to one: " + numberOfGrades);

        // Total average
        double total = 0;
        for (int i = 0; i < grades.length; i++) {
            total += grades[i];
        }
        totalAverage = total / grades.length;
        System.out.println("\nTotal average = " + df.format(totalAverage));
    }
}
