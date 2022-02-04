public class SeveralExercises {
    public static void main(String[] args) {
        /**
         * Exercise 1:
         * Show the length of the text: "Java Programming"
         */
        
        /** 
         * Ejercicio 1:
         * Muestra la longitud del texto: "Programación Java"
         */
        String str1 = "Java Programming";
        System.out.println("Exercise 1");
        System.out.println("Text: " + str1 + "\nLength = " + str1.length());

        /**
         * Exercise 2:
         * Display the String "Java" by screen character by character
         */

        /**
         * Ejercicio 2:
         * Muestra el String "Java" por pantalla carácter a carácter
         */
        String str2 = "Java";
        char[] array1 = str2.toCharArray();
        System.out.println("Exercise 2");
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }

        /**
         * Exercise 3:
         * Reverse text: "Java Programming"
         */

        /**
         * Ejercicio 3:
         * Invertir el texto: "Programación Java"
         */
        String str3 = "Java Programming", reversedString = "";;
        System.out.println("Exercise 3");
        for (int i = str3.length()-1; i >=0 ; i--) {
            reversedString += str3.charAt(i);
        }
        System.out.println(reversedString);

        /**
         * Exercise 4:
         * Remove the spaces in the text: "James Gosling Created Java"
         */

        /**
         * Ejercicio 4:
         * Elimina los espacios del texto: "James Gosling Created Java"
         */
        String str4 = "James Gosling Created Java";
        System.out.println("Exercise 4");
        String result = str4.replaceAll("\\s+","");
        System.out.println("Text: " + str4 + "\nText without spaces: " + result);

        /**
         * Exercise 5:
         * Count the vowels and consonants in the String "Java Programming"
         * */

        /**
         * Ejercicio 5:
         * Cuenta las vocales y las consonantes del String "Java Programming"
         * */
        String str5 = "Java Programming";
        int vowels = 0, consonants = 0;
        str5 = str5.replaceAll("\\s+", "");
        for (char c : str5.toCharArray()) {
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowels++;
            } else {
                consonants++;
            }
        }
        System.out.println("Exercise 5");
        System.out.println(str5 + " has " + vowels + " vowels and " + consonants + " consonants");

        /**
         * Exercise 6:
         * Split the text string "www.javafrom0.com" into two parts "www.java" and "from0.com"
         * Then concatenate them and display them again
         */

        /**
         * Ejercicio 6:
         * Divide la cadena de texto "www.javadesde0.com" en dos partes "www.java" y "desde0.com"
         * Para posteriormente concaténalas y mostrarlas de nuevo
         */
        String str6 = "www.javafrom0.com";
        String strPart1 = str6.substring(0,8);
        String strPart2 = str6.substring(8);
        System.out.println("Exercise 6");
        System.out.println(strPart1);
        System.out.println(strPart2);
        System.out.println(strPart1.concat(strPart2));

        /**
         * Exercise 7:
         * Transform the text string "Gael" to uppercase.
         * Save the value in the variable and then convert it back to lowercase.
         */

        /**
         * Ejercicio 7:
         * Transforma la cadena de texto "Gael" a mayúsculas.
         * Guarda el valor en la variable y posteriormente conviértela nuevamente a minúsculas.
         */
        String str7 = "Gael";
        String name = str7.toUpperCase();
        System.out.println("Exercise 7");
        System.out.println("name.toUpperCase() = " + name);
        System.out.println("name.toLowerCase() = " + name.toLowerCase());

        /**
         * Exercise 8:
         * Compare if the String "Java" is the same as the String "JavaScript".
         */

        /**
         * Ejercicio 8:
         * Compara si el String "Java" es igual que el String "JavaScript"
         */
        String str8 = "Java", str9 = "JavaScript";
        System.out.println("Exercise 8");
        System.out.println("If we compare whether Java and JavaScript are equal, the result is: " + str8.equals(str9));

        /**
         * Exercise 9:
         * On the text string "Jeve jeve jeve jeve" replace all vowels e with the vowel a resulting in "Java java java java"
         */

        /**
         * Ejercicio 9:
         * En la cadena de texto "Jeve jeve jeve jeve" sustituye/reemplaza todas las vocales e por la vocal a dando como resultado "Java java java java"
         */
        String str10 = "Jeve Jeve Jeve";
        String str11 = str10.replaceAll("e", "a");
        System.out.println("Exercise 9");
        System.out.println("Original text: " + str10);
        System.out.println("New text = " + str11);

        /**
         * Exercise 10:
         * Transform the characters from String: "Gael" to ASCII
         */

        /**
         * Ejercicio 10:
         * Transformar los caracteres de la Cadena: "Gael" a ASCII
         */
        String str12 = "Gael";
        System.out.println("Exercise 10");
        // With for traditional
        System.out.println("With for traditional");
        for (int i = 0; i < str12.length(); i++) {
            System.out.println("ASCII: " + (int) str12.charAt(i) + " is equivalent to: " + str12.charAt(i));
        }
        // With forEach
        System.out.println("With forEach");
        for (char character : str12.toCharArray()) {
            System.out.println("ASCII: " + (int) character + " is equivalent to: " + character);
        }
    }
}
