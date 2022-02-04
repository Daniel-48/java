/**
 * Given a string count different types of characters.
 * You must print the number of letters, digits and blanks in the string.
 */

/**
 * Dada una cadena cuente diferentes tipos de caracteres
 * Debe imprimir el número de letras, dígitos y espacios en blanco de la cadena
 */

public class Exercise4 {
    public static void main(String[] args) {
        String str = "Hello, my name is Daniel Pompa Pareja and I am a Senior Technician in Multiplatform Applications Development since 2019";
        int numberOfLetters = 0, numberOfDigits = 0, numberOfSpaces = 0;
        for (char c: str.toCharArray()) {
            if (Character.isLetter(c)) {
               numberOfLetters++;
            } else if (Character.isDigit(c)) {
                numberOfDigits++;
            } else if (Character.isWhitespace(c)) {
                numberOfSpaces++;
            }
        }
        System.out.println("Letters = " + numberOfLetters);
        System.out.println("Digits = " + numberOfDigits);
        System.out.println("Spaces = " + numberOfSpaces);
    }
}
