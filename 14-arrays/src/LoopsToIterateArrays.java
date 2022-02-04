import java.util.Arrays;

public class LoopsToIterateArrays {
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

        int total = products.length;

        System.out.println(BLUE + "Products with for loop" + RESET);
        for (int i = 0; i < total; i++) {
            System.out.println("products[" + i + "] = " + products[i]);
        }

        System.out.println(BLUE + "Reversed products array with for loop" + RESET);
        for (int i = total -1; i >= 0; i--) {
            System.out.println("products[" + i + "] = " + products[i]);
        }

        System.out.println(BLUE + "Products with for each loop" + RESET);
        for(String product : products) {
            System.out.println(product);
        }

        System.out.println(BLUE + "Sorted Products" + RESET);
        Arrays.sort(products);
        for(String product : products) {
            System.out.println(product);
        }

        System.out.println(BLUE + "Products with while loop" + RESET);
        int i = 0;
        while (i < total) {
            System.out.println("products[" + i + "] = " + products[i]);
            i++;
        }

        System.out.println(BLUE + "Products with do while loop" + RESET);
        int j = 0;
        do {
            System.out.println("products[" + j + "] = " + products[j]);
            j++;
        } while (j < total);

        // Filling array of whole numbers with random numbers
        // Llenar un array de números enteros con números aleatorios
        int randomNumber;
        boolean isValid = true;
        int[] numbers = new int[6];

        for (int k = 0; k < numbers.length; k++) {
            do {
                isValid = true;
                randomNumber = (int) (Math.random() * (49 + 1));
                /**
                 * Check if the number generated in the corresponding position of the array is repeated
                 * with a previously generated number.
                 * */
                if (checkNumber(numbers, randomNumber)) {
                    isValid = false;
                }
            } while (!isValid);
            numbers[k] = randomNumber;
        }

        System.out.println(BLUE + "Random numbers with for loop" + RESET);
        for (int k = 0; k < numbers.length; k++) {
            System.out.println("numbers[" + k +"] = " + numbers[k]);
        }
    }

    // Function to check if the number is in the generated number combination
    // Función para comprobar si el numero esta en la combinación de números generada
    private static boolean checkNumber(int[] array, int numberToValidate) {
        boolean repeatNumber = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToValidate) {
                repeatNumber = true;
            }
        }
        return repeatNumber;
    }
}
