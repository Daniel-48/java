import java.util.Scanner;

/**
 * Enter a string of characters and return the inverted string with mirror effect, that is, it's inverse is concatenated to the original word, sharing the last letter, which will act as a mirror, so that the word obtained is read the same forwards and backwards.
 */

/**
 * Introduzca una cadena de caracteres y devuelva la cadena invertida con efecto espejo, esto es, se concatena a la palabra original su inversa, compartiendo la última letra, que hará de espejo, por lo que la palabra obtenida se lee igual hacia adelante que hacia atrás.
 */

public class Exercise11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str, newString = "";
        System.out.println("Enter a string:");
        str = sc.nextLine();
        sc.close();
        for (int i = str.length()-1; i >= 0; i--) {
            newString = newString + str.charAt(i);
        }
        System.out.println(str +  newString);
    }
}
