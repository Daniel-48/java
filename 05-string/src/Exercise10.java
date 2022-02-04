import java.util.Scanner;

/** Enter two strings and return the first string, but capitalize the part that matches the second string entered. */

/** Introduzca dos cadenas de caracteres y que devuelva la primera cadena, pero transformando en mayúsculas la parte que coincide con la segunda cadena introducida. */

public class Exercise10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int position;
        String str1, str2, subString;
        System.out.println("Enter a string:");
        str1 = sc.nextLine();
        System.out.println("Enter the string to be converted to uppercase:");
        str2 = sc.nextLine();
        sc.close();
        position = str1.indexOf(str2);
        // Only if the result of calling indexOf is different from -1 it is because it has been found.
        if (position != -1) {
            subString = str1.substring(position, position + str2.length());
            System.out.println(str1.substring(0, position) + subString.toUpperCase() + str1.substring(position + str2.length()));
        } else {
            System.out.println(str1);
        }
    }
}
