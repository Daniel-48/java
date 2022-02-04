import java.util.Scanner;

public class TernaryOperatorBiggerNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0, number1, number2, number3;
        System.out.println("Enter the first number:");
        number1 = sc.nextInt();
        System.out.println("Enter the second number:");
        number2 = sc.nextInt();
        System.out.println("Enter the third number:");
        number3 = sc.nextInt();
        sc.close();
        max = (number1 > number2) ? number1 : number2;
        max = (max > number3) ? max : number3;
        System.out.println("number 1 = " + number1);
        System.out.println("number 2 = " + number2);
        System.out.println("number 3 = " + number3);
        System.out.println("max = " + max);
    }
}
