import java.util.Scanner;

/**
 * Make a program that when receiving as data two character strings forms a third string by interspersing the characters
 * of the words of the strings received.
 */

/**
 * Hacer un programa que al recibir como datos dos cadenas de caracteres forme una tercera cadena intercalando los
 * caracteres de las palabras de las cadenas recibidas.
 */

public class Exercise8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1, str2, str3 =  "";
        int k = 0;
        System.out.println("Enter the first string:");
        str1 = sc.nextLine();
        System.out.println("Enter the second string:");
        str2 = sc.nextLine();
        sc.close();
        for (int i = 0; i < str1.length(); i++) {
            str3 += str1.charAt(i);
            for (int j = k; j < str2.length(); j++) {
                str3 += str2.charAt(j);
                j = str2.length();
                k++;
            }
        }

        System.out.println("First string: " + str1);
        System.out.println("Second string: " + str2);
        System.out.println("The interleaved string is: " + str3);
    }
}
