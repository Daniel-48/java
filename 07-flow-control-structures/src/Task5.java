import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * For the task a menu is required to manage the users with the options: update, delete, create, list and exit.
 * For the class with the main method we are going to have a menu to select the type of operation, it can be with the Scanner class indicating a list of options, each option associated with a number.
 * Depending on the number entered, use an if or switch to implement each of the 4 operations and 5 to exit.
 * Within each statement or switch print a text related to the option, for example to update:
 * System.out.println("User updated successfully");
 * To delete the message "User successfully deleted" and so on depending on the option.
 * Use a do while to iterate until the exit option is selected, each time an operation other than exit is selected, at the end of that operation you must return to the menu to continue with another one, at the end of the exit option (5) you must display the message "You have successfully exited!" and end the program.
 */

/**
 * Para la tarea se requiere un menú para administrar a los usuarios con las opciones: actualizar, eliminar, crear, listar y salir.
 * Para la clase con el método main vamos a contar con un menú para poder seleccionar el tipo de operación, puede ser con la clase Scanner indicando una lista con las opciones, cada opción asociada a un número.
 * Según el número ingresado usar un if o switch para implementar cada una de las 4 operaciones y 5 para salir.
 * Dentro de cada sentencia o switch imprimir un texto relacionado a la opción, por ejemplo para actualizar:
 * System.out.println("Usuario actualizado correctamente");
 * Para eliminar el mensaje "Usuario eliminado correctamente" y así sucesivamente dependiendo de la opción.
 * Usar un do while para iterar hasta que la opción sea salir, cada vez que se selecciona una operación distinta a salir, al finalizar con dicha operación debe volver al menú para continuar con otra, al finalizar con la opción salir (5) se debe mostrar el mensaje "Has salido con éxito!", y finalizar el programa.
 */

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option;

        try {
            do {
                System.out.println("Select an option (1-5): ");
                System.out.println("1. Update\n2. Delete\n3. Create\n4. List\n5. Exit");
                option = sc.nextInt();
                do {
                    if (option < 1 && option > 5) {
                        System.out.println("Wrong option, you must enter a valid option");
                    }
                } while (option < 1 && option > 5);
                switch (option) {
                    case 1:
                        System.out.println("User successfully updated");
                        break;
                    case 2:
                        System.out.println("User successfully deleted");
                        break;
                    case 3:
                        System.out.println("User successfully created");
                        break;
                    case 4:
                        System.out.println("User list");
                        break;
                    case 5:
                        System.out.println("Successful exit");
                        break;
                    default:
                        System.out.println("Wrong option, you must enter a valid option");
                        break;
                }
            } while (option != 5);
        } catch (InputMismatchException e) {
            System.out.println("You must enter a numeric value");
            main(args);
            System.exit(0);
        }
    }
}
