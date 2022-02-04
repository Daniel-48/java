import java.util.Arrays;

public class ExampleOfArrays {
    public static final String RED = "\u001B[31m";
    public static final String RESET = "\u001B[0m";
    public static void main(String[] args) {
        int[] numbers = new int[6];

        numbers[0] = 2;
        numbers[1] = Integer.valueOf("6");
        numbers[2] = 1;
        numbers[3] = 4;
        numbers[4] = 3;
        numbers[5] = 5;

        int n1 = numbers[0];
        int n2 = numbers[1];
        int n3 = numbers[2];
        int n4 = numbers[3];
        int n5 = numbers[4];
        int n6 = numbers[numbers.length-1];

        System.out.println(RED + "Numbers" + RESET);
        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);
        System.out.println("n3 = " + n3);
        System.out.println("n4 = " + n4);
        System.out.println("n5 = " + n5);
        System.out.println("n6 = " + n6);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[" + i + "] = " + numbers[i]);
        }

        System.out.println(RED + "Sorted Numbers" + RESET);
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[" + i + "] = " + numbers[i]);
        }

        String[] products = {
                "PC Basic",
                "PC Gaming",
                "PC Workstation",
                "Apple iPhone 13",
                "Apple MacBook Air",
                "LG 55\" LED UltraHD",
                "Apple iPad 2021 12,9\"",
        };

        System.out.println(RED + "Products" + RESET);
        for (int i = 0; i < products.length; i++) {
            System.out.println("products[" + i + "] = " + products[i]);
        }

        System.out.println(RED + "Sorted products" + RESET);
        Arrays.sort(products);
        for (int i = 0; i < products.length; i++) {
            System.out.println("products[" + i + "] = " + products[i]);
        }
    }
}
