import java.text.SimpleDateFormat;
import java.util.Date;

public class JavaUtilDateExample {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("date = " + date);

        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        String stringDate = df.format(date);
        System.out.println("date = " + stringDate);

        df = new SimpleDateFormat("dd/MM/yyyy");
        stringDate = df.format(date);
        System.out.println("date = " + stringDate);

        df = new SimpleDateFormat("dd 'de' MMMM yyyy");
        stringDate = df.format(date);
        System.out.println("date = " + stringDate);

        df = new SimpleDateFormat("EEEE, dd MMMM yyyy");
        stringDate = df.format(date);
        System.out.println("date = " + stringDate);

        df = new SimpleDateFormat("EEEE dd MMMM yyyy 'hora' HH:mm:ss");
        stringDate = df.format(date);
        System.out.println("date = " + stringDate);

        long sum = 0;
        Date start = new Date();
        for (int i = 0; i < 10000000; i++) {
            sum += i;
        }
        System.out.println("sum = " + sum);
        Date end = new Date();
        long time = end.getTime() - start.getTime();
        System.out.println("Elapsed computation time within the for-loop= " + time + "ms");
    }
}
