import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculateAreas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option;

        do {
            System.out.println("Select an option:" +
                    "\n1.Calculate area of a square" +
                    "\n2.Calculate area of a rectangle" +
                    "\n3.Calculate area of a triangle" +
                    "\n4.Calculate area of a circle" +
                    "\n5.Exit");
            option = sc.nextInt();
        } while (option < 1 || option > 5);

        switch (option) {
            case 1:
                calculateSquareArea();
                break;
            case 2:
                calculateRectangleArea();
                break;
            case 3:
                calculateTriangleArea();
                break;
            case 4:
                calculateCircleArea();
                break;
            case 5:
                exit();
                break;
            default:
                System.out.println("Please enter a valid option");
                break;
        }
        sc.close();
    }

    private static void calculateSquareArea() {
        Scanner sc = new Scanner(System.in);
        double side, area = 0;
        try {
            System.out.println("You have selected to calculate the area of a square");
            System.out.println("Enter the value of the side of the square:");
            side = sc.nextDouble();
            area = Math.pow(side, 2);
        } catch (InputMismatchException e) {
            System.err.println("Enter a numeric value");
        }
        System.out.println("The area of the square is: " + area);
        sc.close();
    }

    private static void calculateRectangleArea() {
        Scanner sc = new Scanner(System.in);
        double base, height, area = 0;
        try {
            System.out.println("You have selected to calculate the area of a rectangle");
            System.out.println("Enter the value of the base of the rectangle:");
            base = sc.nextDouble();
            System.out.println("Enter the value of the height of the rectangle");
            height = sc.nextDouble();
            area = base * height;
        } catch (InputMismatchException e) {
            System.err.println("Enter a numeric value");
        }
        System.out.println("The area of the rectangle is: " + area);
        sc.close();
    }

    private static void calculateTriangleArea() {
        Scanner sc = new Scanner(System.in);
        double base, height, area = 0;
        try {
            System.out.println("You have selected to calculate the area of a triangle");
            System.out.println("Enter the value of the base of the triangle:");
            base = sc.nextDouble();
            System.out.println("Enter the value of the height of the triangle:");
            height = sc.nextDouble();
            area = (base * height) / 2;
        } catch (InputMismatchException e) {
            System.err.println("Enter a numeric value");
        }
        System.out.println("The area of the triangle is: " + area);
        sc.close();
    }

    private static void calculateCircleArea() {
        Scanner sc = new Scanner(System.in);
        double radius, area = 0;
        try {
            System.out.println("You have selected to calculate the area of a circle");
            System.out.println("Enter the value of the radius of the circle:");
            radius = sc.nextDouble();
            area =  Math.PI * Math.pow(radius,2);
        } catch (InputMismatchException e) {
            System.err.println("Enter a numeric value");
        }
        System.out.println("The area of the square is: " + area);
        sc.close();
    }

    private static void exit() {
        System.out.println("You have exited the application");
    }
}
