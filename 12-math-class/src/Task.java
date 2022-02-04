import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

/** Ask for the radius of a circle and calculate its area. */

/** Pedir el radio de un círculo y calcular su área. */

public class Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        double radius = 0, area = 0;

        try {
            System.out.println("Enter the value of the radius of the circle:");
            radius = sc.nextDouble();
            area =  Math.PI * (radius * radius);
        } catch (InputMismatchException e) {
            System.out.println("Enter a numeric value");
            main(args);
            System.exit(0);
        }
        sc.close();
        System.out.print("The area of the circle is: " + df.format(area) + "\n");
    }
}
