import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class JavaUtilDateParse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println("Enter a date with format (dd-MM-yyyy):");
        try {
            Date date1 = dateFormat.parse(sc.next());
            System.out.println("date1 = " + date1);
            System.out.println("date1 format = " + dateFormat.format(date1));
            Date date2 = new Date();
            System.out.println("date2 = " + date2);
            if (date1.after(date2)) {
                System.out.println("Date entered by user is later than current date");
            } else if (date1.before(date2)) {
                System.out.println("Date entered by the user is earlier than the current date");
            } else if (date1.equals(date2)) {
                System.out.println("Dates are the same");
            }
            System.out.println("Another way of matching dates");
            if (date1.compareTo(date2) > 0) {
                System.out.println("Date entered by user is later than current date");
            } else if (date1.compareTo(date2) < 0) {
                System.out.println("Date entered by the user is earlier than the current date");
            } else if (date1.compareTo(date2) == 0) {
                System.out.println("Dates are the same");
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
