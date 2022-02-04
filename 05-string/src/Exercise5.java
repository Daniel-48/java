import java.util.Scanner;

/**
 * Read a sentence from the keyboard and find the longest word.
 * The program should print the word as the number of characters in the word.
 */

/**
 * Leer una frase por teclado y encontrar la palabra de mayor longitud.
 * El programa debe imprimir la palabra como el número de caracteres de la misma.
 */

public class Exercise5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, c = 0;
        String string, word = "", show = null;
        System.out.println("Enter string: ");
        string = sc.nextLine();
        string += " ";
        sc.close();
        for(i = 0;i < string.length();i++) {
            word = word + string.charAt(i);
            if(string.charAt(i) == ' ') {
                if(word.length()-1 > c) {
                    c = word.length()-1;
                    show = word.trim();
                }
                word = "";
            }
        }
        System.out.println("The word with the longest length is: " + show);
        System.out.println("It's length is: "+ c);
    }
}
