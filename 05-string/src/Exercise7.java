import java.util.Scanner;

/**
 * Encode messages in such a way that they cannot be interpreted by direct reading, for which the following rules have been established:
 * 1. All messages must be written in capital letters.
 * 2. Replace each letter with the next letter of the alphabet, except for Z, which must be replaced with the letter A.
 * 3. Replace each digit found by the next number except 9 which should be replaced by 0.
 */

/**
 * Codificar los mensajes de tal forma que no puedan ser interpretados con una lectura directa, para lo cual han establecido las siguientes reglas:
 * 1. Todos los mensajes deben estar sus letras en mayúsculas.
 * 2. Reemplazar cada letra por la que sigue según abecedario, excepto Z que se deberá reemplazar con la letra A.
 * 3. Reemplazar cada dígito encontrado por el siguiente número excepto el 9 que deberá ser reemplazado por el 0.
 */

public class Exercise7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String message, c = "", character = null;
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numbers = "0123456789";
        System.out.println("Enter the message:");
        message = sc.nextLine().toUpperCase();
        sc.close();
        for (int i = 0; i < message.length(); i++) {
            character = message.substring(i,i+1);
            if (character.equals(" ")) {
                c = c + character;
            } else {
                for (int j = 0; j < alphabet.length(); j++) {
                    if (character.equals(alphabet.substring(j,j+1))) {
                        if (character.equals("Z")) {
                           c = c + "A";
                           break;
                        } else {
                            c = c + alphabet.substring(j+1,j+2);
                            break;
                        }
                    }
                }
            }
        }

        for (int k = 0; k < numbers.length(); k++) {
            if (character.equals(numbers.substring(k,k+1))) {
                if (character.equals("9")) {
                    c = c + "0";
                    break;
                } else  {
                    c = c + numbers.substring(k+1,k+2);
                    break;
                }
            }
        }

        System.out.println("Original message: " + message);
        System.out.println("Encrypted message: " + c);
    }
}
