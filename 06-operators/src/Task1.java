import java.util.Scanner;

/**
 * The challenge is a program that asks for two numbers and displays them in order from largest to smallest.
 * It could be using ternary operator.
 */

/**
 * El desafío es un programa que pida dos números y los muestre ordenados de mayor a menor.
 * Podría ser utilizando operador ternario.
 */

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String result = "";
        int number1, number2;
        System.out.println("Enter the first number:");
        number1 = sc.nextInt();
        System.out.println("Enter the second number:");
        number2 = sc.nextInt();
        sc.close();

        // Solution with if and else if
        if (number1 > number2) {
            System.out.println("result = " + number1 + "," + number2);
        } else if (number2 > number1) {
            System.out.println("result = " + number2 + "," + number1);
        } else {
            System.out.println("The two numbers are equal");
        }

        // Solution with ternary operator
        result = (number1 > number2) ? number1 + "," + number2 : number2 + "," + number1;
        System.out.println("result = " + result);
    }
}
