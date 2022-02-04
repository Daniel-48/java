import java.text.DecimalFormat;
import java.util.Scanner;

public class ArithmeticOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        int a = 0, b = 0, c = 0;
        System.out.println("Enter the first number:");
        a = sc.nextInt();
        System.out.println("Enter the second number:");
        b = sc.nextInt();
        int sum = a + b, subtract = a - b, multiplication = a * b, remainder = a % b;
        float division = (float) a / (float) b;
        System.out.println(a + " + " + b + " = " + sum);
        System.out.println(a + " - " + b + " = " + subtract);
        System.out.println(a + " * " + b + " = " + multiplication);
        System.out.println(a + " / " + b + " = " + df.format(division));
        System.out.println(a + " % " + b + " = " + remainder);
        System.out.println("Enter a number to check if it is even or odd:");
        c = sc.nextInt();
        if (c % 2 == 0) {
            System.out.println("The number " + c + " is even");
        } else {
            System.out.println("The number " + c + " is odd");
        }
    }
}
