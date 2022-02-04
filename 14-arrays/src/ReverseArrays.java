import java.util.Arrays;
import java.util.Collections;

public class ReverseArrays {
    public static final String BLUE = "\u001B[34m";
    public static final String RESET = "\u001B[0m";
    public static void main(String[] args) {
        String[] products = {
                "PC Basic",
                "PC Gaming",
                "PC Workstation",
                "Apple iPhone 13",
                "Apple MacBook Air",
                "LG 55\" LED UltraHD",
                "Apple iPad 2021 12,9\"",
        };

        System.out.println(BLUE + "Products with for loop" + RESET);
        for (int i = 0; i < products.length; i++) {
            System.out.println("products[" + i + "] = " + products[i]);
        }

        int total = products.length;

        System.out.println(BLUE + "Reversed product array" + RESET);
        for (int i = 0; i < total/2; i++) {
            String current = products[i];
            String reverse = products[total-1-i];
            products[i] = reverse;
            products[total-1-i] = current;
        }

        for (int i = 0; i < total; i++) {
            System.out.println("products[" + i + "] = " + products[i]);
        }

        System.out.println(BLUE + "Another way to reverse the product array" + RESET);
        reversedArray(products);
        for (int i = 0; i < products.length; i++) {
            System.out.println("products[" + i + "] = " + products[i]);
        }

        System.out.println(BLUE + "Reversed product array with Java Collections" + RESET);
        // Reverses the order of the elements in the specified list
        Collections.reverse(Arrays.asList(products));
        for (int i = 0; i < products.length; i++) {
            System.out.println("products[" + i + "] = " + products[i]);
        }
    }

    public static void reversedArray(String[] array) {
        int length1 = array.length;
        int length2 = array.length;
        for (int i = 0; i < length1; i++) {
            String current = array[i];
            String reverse = array[length2-1-i];
            array[i] = reverse;
            array[length2-1-i] = current;
            length1--;
        }
    }
}
