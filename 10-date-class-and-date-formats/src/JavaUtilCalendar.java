import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class JavaUtilCalendar {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        // calendar.set(2020, 7, 22);
        calendar.set(Calendar.YEAR, 2022);
        calendar.set(Calendar.MONTH, Calendar.APRIL);
        calendar.set(Calendar.DAY_OF_MONTH, 7);
        calendar.set(Calendar.HOUR_OF_DAY, 17);
        calendar.set(Calendar.MINUTE, 26);
        calendar.set(Calendar.SECOND, 38);
        Date date = calendar.getTime();
        System.out.println("date = " + date);
        SimpleDateFormat df = new SimpleDateFormat("dd MMMM YYYY HH:mm:ss");
        String stringDate = df.format(date);
        System.out.println("date = " + stringDate);
        calendar.set(Calendar.HOUR, 5);
        calendar.set(Calendar.AM_PM, Calendar.PM);
        df = new SimpleDateFormat("dd MMMM YYYY hh:mm:ss 'p.m.'");
        stringDate = df.format(date);
        System.out.println("date = " + stringDate);
    }
}
