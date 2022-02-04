import java.util.Scanner;

/**
 * The task is to create a class called NameManagementProgram as follows:
 * You are required to develop a program that receives the names of 3 members of your family or friends as command line arguments.
 * For each person's name a new String variable is requested by taking the second character but converted to uppercase and concatenating a dot and the last two characters of the person. For example for Andres it should look like N.es
 * It should print as a result the three new names separated with a hyphen (as a single variable).
 * Example, an expected final result for the names Daniel, Emma and Gael could be:
 * A.el_M.ma_A.el
 */

/**
 * La tarea consiste en crear una clase llamada ProgramaManejoDeNombres de la siguiente manera:
 * Se requiere desarrollar un programa que reciba los nombres de 3 integrantes de tu familia o amigos como argumentos de línea de comandos.
 * Se pide por cada nombre de la persona una nueva variable del tipo String al tomar el segundo carácter, pero convertido en mayúscula y se le concatena un punto y los dos últimos caracteres de la persona. Por ejemplo para Andres debe quedar como N.es
 * Debe imprimir como resultado los tres nuevos nombres separado con guion (como una única variable).
 * Ejemplo, un resultado final esperado para los nombres Daniel, Emma y Gael podría ser:
 * A.el_M.ma_A.el */

public class NameManagementProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name1, name2, name3, result1, result2;
        System.out.println("Enter the first name:");
        name1 = sc.nextLine();
        System.out.println("Enter the second name:");
        name2 = sc.nextLine();
        System.out.println("Enter the third name:");
        name3 = sc.nextLine();
        sc.close();

        // First solution
        String a = name1.substring(1,2).toUpperCase().concat(".").concat(name1.substring(name1.length()-2));
        String b = name2.substring(1,2).toUpperCase().concat(".").concat(name2.substring(name2.length()-2));
        String c = name3.substring(1,2).toUpperCase().concat(".").concat(name3.substring(name3.length()-2));
        result1 =  a.concat("_").concat(b).concat("_").concat(c);
        System.out.println("First solution");
        System.out.println("result = " + result1);

        // Second solution
        String d = name1.toUpperCase().charAt(1) + "." + name1.substring(name1.length()-2);
        String e = name2.toUpperCase().charAt(1) + "." + name2.substring(name2.length()-2);
        String f = name3.toUpperCase().charAt(1) + "." + name3.substring(name3.length()-2);
        result2 = d + "_" + e + "_" + f;
        System.out.println("Second solution");
        System.out.println("result = " + result2);
    }
}
