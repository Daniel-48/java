import javax.swing.*;

/**
 * Get the longest name of three people, according to the following requirements
 * By means of the keyboard ask for the full name (first name + last name) of three family members or friends using the JOptionPane class and showInputDialog() method.
 * Calculate and Print the name of the person with the longest name (in number of characters) (Print only one of the three, the one with the most characters in the name).
 * You could use .split(" "); of the String object to separate first and last name in an array, and with the index zero we access the name of the person.
 * Restriction not to use loops in the development of the task.
 * Example of the result: "Daniel Sanz has the longest name".
 */

/**
 * Obtener el nombre más largo de tres personas, según los siguientes requerimientos
 * Mediante el teclado pedir el nombre completo (nombre + apellido) de tres miembros de la familia o amigos usando la clase JOptionPane y método showInputDialog().
 * Calcular e Imprimir el nombre de la persona que tenga el nombre más largo (en cantidad de caracteres)   (Imprimir sólo uno de los tres, el de más caracteres en el nombre.)
 * Podría usar .split(" "); del objeto String para separar nombre y apellido en un arreglo, y con el índice cero accedemos al nombre de la persona.
 * Restricción no usar loops en el desarrollo de la tarea.
 * Ejemplo del resultado: "Daniel Sanz tiene el nombre más largo."
 */

public class Task3 {
    public static void main(String[] args) {
        String  longerName = "";
        String person1 = JOptionPane.showInputDialog(null,"Enter the name and last surname of the first family member or friend");
        String person2 = JOptionPane.showInputDialog(null,"Enter the name and last surname of the second family member or friend");
        String person3 = JOptionPane.showInputDialog(null,"Enter the name and last surname of the third family member or friend");

        // With if else if
        System.out.println("With if else if");
        if (person1.split(" ")[0].length() > person2.split(" ")[0].length() && person1.split(" ")[0].length() > person3.split(" ")[0].length()) {
            longerName = person1;
        } else if (person2.split(" ")[0].length() > person1.split(" ")[0].length() && person2.split(" ")[0].length() > person3.split(" ")[0].length()) {
            longerName = person2;
        } else {
            longerName = person3;
        }
        System.out.println("The person with the longest name is " + longerName);

        // With ternary operator
         longerName = (person1.split(" ")[0].length() < person2.split(" ")[0].length()) ? person2 : person1;
         longerName = (person3.split(" ")[0].length() < longerName.split(" ")[0].length()) ? longerName: person3;
        System.out.println("With ternary operator");
        System.out.println("The person with the longest name is " + longerName);
    }
}
