import java.util.Scanner;

/**
 * Enter a string and determine how many words are in the string.
 * Each word is separated by a blank space.
 */

/**
 * Ingresar una cadena y determinar cuantas palabras se encuentran en la cadena.
 * Cada palabra se separa por medio de un espacio en blanco.
 */

public class Exercise6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = 1;
        String string, word = "";
        System.out.println("Enter the string to be evaluated:");
        string = sc.nextLine();
        sc.close();
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == ' ') {
                c++;
            }
        }
        System.out.println("String contains " + c + " words");
    }
}
