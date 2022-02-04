import java.util.Scanner;

/** Enter a text and indicate which letters have not appeared in the text. */

/** Introduzca un texto e indique que letras no han aparecido en el texto. */

public class Exercise9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = 0;
        String text, aux = "", message = "";
        System.out.println("Enter the text to be evaluated:");
        text = sc.nextLine();
        sc.close();
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != ' ') {
                aux = aux + text.charAt(i);
            }
        }
        aux = aux.toLowerCase();
        for (char character = 'a'; character <= 'z'; character++) {
            for (int i = 0; i < aux.length(); i++) {
                if (character == aux.charAt(i)) {
                    c++;
                }
            }
            if (c == 0) {
                message += character + " ";
            }
            c = 0;
        }
        System.out.println("The missing characters are: " + message);
    }
}
