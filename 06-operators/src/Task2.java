import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Assuming a gasoline (gas) tank with a capacity of 70 liters, we need a program that asks for the current measurement in liters and display the result in the form: Insufficient, Sufficient, Medium....
 * The current measurement or capacity of the tank can be in type double, for better precision, but it can also be of type int.
 *
 * If the current capacity is 70 liters: print pond full.
 * If it is between 60 and less than 70: print pond almost full
 * If it is between 40 and less than 60: print pond 3/4
 * If between 35 and less than 40: print Half pond
 * If between 20 and less than 35: print sufficient
 * If between 1 and less than 20: print insufficient
 */

/**
 * Suponiendo un estanque de gasolina (gas) con capacidad 70 litros, se requiere un programa que pida la medida actual en litros y mostrar el resultado de la forma: Insuficiente, Suficiente, Medio...
 * La medida o capacidad actual del estanque puede ser en tipo double, para una mejor precisión, pero tambien puede ser del tipo int.
 *
 * Si la capacidad actual es 70 litros: imprimir Estanque lleno
 * Si está entre 60 y menor a 70: imprimir Estanque casi lleno
 * Si está entre 40 y menor a 60: imprimir Estanque 3/4
 * Si está entre 35 y menor a 40: imprimir Medio Estanque
 * Si está entre 20 y menor a 35: imprimir Suficiente
 * Si está entre 1 y menor a 20: imprimir Insuficiente
 */

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int liters;
         try {
             do {
                 System.out.println("Current measurement in liters:");
                 liters = sc.nextInt();
                 if (liters < 0 || liters > 70) {
                     System.out.println("The fuel tank capacity is 70 liters.");
                     System.out.println("Please enter an amount between 0 and 70");
                 }
             } while (liters < 0 || liters > 70);
             sc.close();
             if (liters == 70) {
                 System.out.println("Pond full");
             } else if (liters >= 60 && liters < 70) {
                 System.out.println("Pond almost full");
             } else if (liters >= 40 && liters < 60) {
                 System.out.println("Pond 3/4");
             } else if (liters >= 35 && liters < 40) {
                 System.out.println("Half pond");
             } else if (liters >= 20 && liters < 35) {
                 System.out.println("Sufficient");
             } else if (liters >= 0 && liters < 20) {
                 System.out.println("Insufficient");
             }
         } catch (InputMismatchException e) {
             System.out.println("You must enter a numeric value");
             main(args);
             System.exit(0);
         }
    }
}
