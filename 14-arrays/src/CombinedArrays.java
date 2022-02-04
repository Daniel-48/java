public class CombinedArrays {
    public static final String BLUE = "\u001B[34m";
    public static final String RESET = "\u001B[0m";
    public static void main(String[] args) {
        int[] a,b,c;

        a = new int[6];
        b = new int[6];
        c = new int[12];

        int randomNumber;
        boolean isValid = true;

        // Filling array of whole numbers with random numbers
        // Llenar un array de números enteros con números aleatorios
        System.out.println(BLUE + "First array" + RESET);
        for (int i = 0; i < a.length; i++) {
            do {
                isValid = true;
                randomNumber = (int) (Math.random() * (49 + 1));
                /**
                 * Check if the number generated in the corresponding position of the array is repeated
                 * with a previously generated number.
                 */
                if (checkNumber(a, randomNumber)) {
                    isValid = false;
                }
            } while (!isValid);
            a[i] = randomNumber;
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "] = " + a[i]);
        }

        System.out.println(BLUE + "Second array" + RESET);
        for (int i = 0; i < b.length; i++) {
            do {
                isValid = true;
                randomNumber = (int) (Math.random() * (49 + 1));
                /**
                 * Check if the number generated in the corresponding position of the array is repeated
                 * with a previously generated number.
                 */
                if (checkNumber(a, randomNumber)) {
                    isValid = false;
                }
            } while (!isValid);
            b[i] = randomNumber;
        }

        for (int i = 0; i < b.length; i++) {
            System.out.println("b[" + i + "] = " + b[i]);
        }

        System.out.println(BLUE + "Combined array" + RESET);
        int aux = 0;
        for (int i = 0; i < 6; i++) {
            c[aux++] = a[i];
            c[aux++] = b[i];
        }

        for (int i = 0; i < c.length; i++) {
            System.out.println("c[" + i + "] = " + c[i]);
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
