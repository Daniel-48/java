import java.util.Locale;
import java.util.Scanner;

/**
 * Given a string, invert it and display it on the screen.
 * Example
 * Input: "Gael"
 * Output: "leaG"
 */

/**
 * Dada una cadena invertir la misma y mostrar por pantalla.
 * Ejemplo
 * Entrada: "Gael"
 * Salida: "leaG"
 */

public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str, reversedString = "";
        System.out.println("Enter a sentence or word:");
        str = sc.nextLine();
        sc.close();
        // Traverse the string, character by character, from the last character to the first character.
        for (int i = str.length()-1; i >= 0; i--) {
            reversedString += str.charAt(i);
        }
        System.out.println("reversed string = " + reversedString);
    }
}
