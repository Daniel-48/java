import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * For this task you are asked to enter a date of birth in string format, convert it to a date of type java.util.Date and calculate the age of the person according to the current date.
 * Try to use only what we have seen so far, not the java 8 api that we will see later.
 */

/**
 * Para esta tarea se pide ingresar una fecha de nacimiento en formato string, convertirla a una fecha del tipo java.util.Date y calcular la edad de la persona de acuerdo a la fecha actual.
 * Intentar usar solo lo visto hasta el momento, no el api de java 8 que lo veremos más adelante.
 */

public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String stringDate;
        Date dateOfBirth;
        Date currentDate = new Date();
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");

        try {
            System.out.println("Enter a date of birth (yyyy-MM-dd):");
            stringDate = sc.next();
            dateOfBirth = df.parse(stringDate);
            // Create a numeric date pattern with the year month and day
            df = new SimpleDateFormat("yyyyMMdd");
            // Then we convert both the current date and the date of birth
            // Into integers containing the year month and day
            int from = Integer.parseInt(df.format(dateOfBirth));
            int to = Integer.parseInt(df.format(currentDate));
            // Then we subtract both dates and divide by 10000 to remove decimals and leave the date in tens or hundreds
            int age = (to - from) / 10000;
            System.out.println("The age is: " + age);
        } catch (ParseException e) {
            System.out.println("Incorrect date format");
            main(args);
            System.exit(0);
        }
    }
}
