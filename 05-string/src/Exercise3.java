import java.util.Scanner;

/**
 * Given a string str, and a character c, check how many times the character c is repeated in the string str.
 * Example
 * Input: str = "white house", c = 'e'
 * Output: The character 'e' is repeated 2 times
 */

/**
 * Dada una cadena str, y un carácter c, verificar cuántas veces se repite el carácter c en la cadena str.
 * Ejemplo
 * Entrada: str = "casa blanca", c = 'a'
 * Salida: El carácter 'a' se repite 4 veces
 */

public class Exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence or word:");
        String str = sc.nextLine().toLowerCase();
        System.out.println("Enter the character to search:");
        String character = sc.nextLine();
        sc.close();
        // Get the first character to store it in a char, which would be the char we should look for in the first string entered
        char c = character.charAt(0);
        int numberOfRepetitions = 0;
        for (int i = 0; i < str.length(); i++) {
            char aux = str.charAt(i); // Get the character at position i
            if (aux == c) {
                numberOfRepetitions++;
            }
        }
        System.out.println("number of repetitions: " + numberOfRepetitions);
    }
}
