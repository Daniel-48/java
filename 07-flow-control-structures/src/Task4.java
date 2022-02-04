import javax.swing.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * For the task a menu is required to manage the products with the options: update, delete, create, list and exit.
 * For the class with the main method we are going to have a menu to select the type of operation, it can be with the Scanner class indicating a list of options, each option associated with a number.
 * Depending on the number entered, use an if or switch to implement each of the 4 operations and 5 to exit.
 * Within each statement or switch print a text related to the option, for example to update:
 * System.out.println("User updated successfully");
 * To delete the message "User successfully deleted" and so on depending on the option.
 * Use a do while to iterate until the exit option is selected, each time an operation other than exit is selected, at the end of that operation you must return to the menu to continue with another one, at the end of the exit option (5) you must display the message "You have successfully exited!" and end the program.
 */

/**
 * Para la tarea se requiere un menú para administrar a los productos con las opciones: actualizar, eliminar, crear, listar y salir.
 * Para la clase con el método main vamos a contar con un menú para poder seleccionar el tipo de operación, puede ser con la clase Scanner indicando una lista con las opciones, cada opción asociada a un número.
 * Según el número ingresado usar un if o switch para implementar cada una de las 4 operaciones y 5 para salir.
 * Dentro de cada sentencia o switch imprimir un texto relacionado a la opción, por ejemplo para actualizar:
 * System.out.println("Usuario actualizado correctamente");
 * Para eliminar el mensaje "Usuario eliminado correctamente" y así sucesivamente dependiendo de la opción.
 * Usar un do while para iterar hasta que la opción sea salir, cada vez que se selecciona una operación distinta a salir, al finalizar con dicha operación debe volver al menú para continuar con otra, al finalizar con la opción salir (5) se debe mostrar el mensaje "Has salido con éxito!" y finalizar el programa.
 */

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int index = 0;
        Map<String, Integer> options = new HashMap<>();
        options.put("Update", 1);
        options.put("Delete", 2);
        options.put("Create", 3);
        options.put("List", 4);
        options.put("Exit", 5);
        Object[] array = options.keySet().toArray();
        do {
            Object option = JOptionPane.showInputDialog(null,
                    "Select an option:",
                    "Product Manager",
                    JOptionPane.INFORMATION_MESSAGE, null, array, array[0]);
            if (option == null) {
                JOptionPane.showMessageDialog(null, "You must select an option");
            } else {
                index = options.get(option.toString());
                switch (index) {
                    case 1:
                        JOptionPane.showMessageDialog(null, "User successfully updated");
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "User successfully deleted");
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "User successfully created");
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, "User list");
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null, "Successful exit");
                        break;
                    default:
                        System.out.println("Wrong option, you must enter a valid option");
                        break;
                }
            }
        } while (index != 5);
    }
}
