import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * For this task you are asked to enter a date of birth in string format, convert it to a date of type java.util.Date and calculate the age of the person according to the current date.
 * Try to use only what we have seen so far, not the java 8 api that we will see later.
 */

/**
 * Para esta tarea se pide ingresar una fecha de nacimiento en formato string, convertirla a una fecha del tipo java.util.Date y calcular la edad de la persona de acuerdo a la fecha actual.
 * Intentar usar solo lo visto hasta el momento, no el api de java 8 que lo veremos más adelante.
 */

public class Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String stringDate;
        Date dateOfBirth;
        Calendar currentDate = Calendar.getInstance();
        Calendar calendar = new GregorianCalendar();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

        try {
            System.out.println("Enter your date of birth:");
            stringDate = sc.nextLine();
            dateOfBirth = dateFormat.parse(stringDate);
            calendar.setTime(dateOfBirth);
            long ageInDays = (currentDate.getTimeInMillis() - calendar.getTimeInMillis()) / 1000 / 60 / 60 / 24;
            int years = Double.valueOf(ageInDays / 365.25d).intValue();
            int days = Double.valueOf(ageInDays % 365.25d).intValue();
            System.out.println(String.format("You have %d years and %d days", years, days));
        } catch (ParseException e) {
            System.out.println("Incorrect date format");
            main(args);
            System.exit(0);
        }
    }
}
