import java.util.Arrays;

public class SortingAlgorithmsBubbleMethod {
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

        System.out.println(BLUE + "Products" + RESET);
        for (int i = 0; i < products.length; i++) {
            System.out.println("products[" + i + "] = " + products[i]);
        }

        System.out.println(BLUE + "Sorted products" + RESET);
        Arrays.sort(products);
        for (int i = 0; i < products.length; i++) {
            System.out.println("products[" + i + "] = " + products[i]);
        }

        System.out.println(BLUE + "Products sorted with the bubble method" + RESET);
        int c = 0;
        for (int i = 0; i < products.length; i++) {
            for (int j = 0; j < products.length; j++) {
                if (products[i].compareTo(products[j]) < 0) {
                    String aux = products[i];
                    products[i] = products[j];
                    products[j] = aux;
                }
                c++;
            }
        }

        System.out.println("Number of iterations = " + c);

        for (int i = 0; i < products.length; i++) {
            System.out.println("products[" + i + "] = " + products[i]);
        }

        System.out.println(BLUE + "Optimize the bubble method" + RESET);
        bubbleMethod(products);
        for (int i = 0; i < products.length; i++) {
            System.out.println("products[" + i + "] = " + products[i]);
        }

        Integer[] numbers = {6,1,5,2,4,3};

        System.out.println(BLUE + "Numbers" + RESET);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[" + i + "] = " + numbers[i]);
        }

        System.out.println(BLUE + "Numbers sorted with the bubble method" + RESET);
        bubbleMethod(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[" + i + "] = " + numbers[i]);
        }
    }

    public static void bubbleMethod(Object[] array) {
        int counter = 0;
        int length = array.length;
        for (int i = 0; i < length-1; i++) {
            for (int j = 0; j < length-1-i; j++) {
                if (((Comparable) array[j+1]).compareTo(array[j]) < 0) {
                    Object aux = array[j];
                    array[j] = array[j+1];
                    array[j+1] = aux;
                }
                counter++;
            }
        }
        System.out.println("Number of iterations = " + counter);
    }
}
