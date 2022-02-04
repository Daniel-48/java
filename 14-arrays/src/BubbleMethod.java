import java.util.Scanner;

public class BubbleMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfElements = 6;
        int array[] = new int[numberOfElements];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }

        System.out.println("The numbers entered are:");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Number " + (i + 1) + ": " + array[i]);
        }

        System.out.println("The result of filling the array is:");
        for (int i = 0; i < array.length; i++) {
            System.out.print("[" + array[i] + "]");
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int aux = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = aux;
                }
            }
        }

        System.out.println();
        System.out.println("The result of ordering the array numbers from smallest to largest is:");
        for (int i = 0; i < array.length; i++) {
            System.out.print("[" + array[i] + "]");
        }
    }
}
