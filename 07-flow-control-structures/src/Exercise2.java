import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * A 2nd degree equation is an equation containing one unknown squared.
 * The following cases can occur, these cases will depend on the discriminant, which is the part inside the square root:
 * - If the discriminant is greater than 0, there are two solutions.
 * - If the discriminant is 0, there is only one solution.
 * - If the discriminant is less than 0, there is no possible solution.
 * In Java, we are going to carry out a method to calculate a 2nd degree equation, passing the values of a, b and c.
 * According to these cases that we have commented, we will return an array of doubles, being of 1 or two positions. Null if it has no solution.
 */

/**
 * Una ecuación de 2º grado es una ecuación que contiene una incógnita elevada al cuadrado.
 * Pueden ocurrir los siguientes casos, estos casos dependerán del discriminante, que es la parte que hay dentro de la raíz cuadrada:
 * - Si el discriminante es mayor que 0, hay dos soluciones.
 * - Si el discriminante es 0, solo hay una solución.
 * - Si el discriminante es menor que 0, no hay solución posible.
 * En Java, vamos a realizar un método para calcular una ecuación de 2º grado, pasandole los valores de a,b y c.
 * Según estos casos que hemos comentado, devolveremos un array de doubles, siendo de 1 o dos posiciones. Null si no tiene solución.
 */

public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c, discriminant;

        System.out.println("This program solves second degree equations");
        System.out.println("ax^2 + bx + c = 0");
        System.out.println("Please enter the values:");
        try {
            System.out.print("a = ");
            a = sc.nextDouble();
            System.out.print("b = ");
            b = sc.nextDouble();
            System.out.print("c = ");
            c = sc.nextDouble();
            sc.close();
            // 0x^2 + 0x + 0 = 0
            if ((a == 0) && (b == 0) && (c == 0)) {
                System.out.println("The equation has no solution");
            }
            // ax^2 + bx + 0 = 0 with a and b other than 0
            if ((a != 0) && (b != 0) && (c == 0)) {
                System.out.println("x1 = 0");
                System.out.println("x2 = " + (-b / a));
            }
            // 0x^2 + bx + c = 0 with b and c other than 0
            if ((a == 0) && (b != 0) && (c != 0)) {
                System.out.println("x1 = x2 = " + (-c / b));
            }
            // ax^2 + bx + c = 0 with a, b and c other than 0
            if ((a != 0) && (b != 0) && (c != 0)) {
                discriminant = b*b - (4 * a * c);
                if (discriminant < 0) {
                    System.out.println("The equation has no real solutions");
                    System.out.println("The equation has two different complex solutions");
                } else {
                    System.out.println("x1 = " + (-b + Math.sqrt(discriminant))/(2*a));
                    System.out.println("x2 = " + (-b - Math.sqrt(discriminant))/(2*a));
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("You must enter a numeric value");
            main(args);
            System.exit(0);
        }
    }
}
