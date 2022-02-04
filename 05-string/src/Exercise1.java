import java.util.Scanner;

/**
 * Given a string, display the number of vowels it has. Example:
 * Input: str = "Hello world".
 * Output: The number of vowels is 3
 */

/**
 * Dada una cadena mostrar por pantalla la cantidad de vocales que tiene. Ejemplo:
 * Entrada: str = "Hola mundo"
 * Salida: La cantidad de vocales es 4
 */

public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        int numberOfVowels = 0;
        System.out.println("Enter a sentence or word:");
        str = sc.nextLine();
        sc.close();
        for (int i = 0; i < str.length(); i++) {
            char character = str.charAt(i); // Get the character at position i
            if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
                numberOfVowels++;
            }
        }
        System.out.println("number of vowels: " + numberOfVowels);
    }
}
