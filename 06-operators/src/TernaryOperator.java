import java.text.DecimalFormat;
import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat dc = new DecimalFormat("#.0");
        String name = "Gael";
        System.out.println("Student = " + name);
        String state = "";
        double average = 0.0;
        double programming = 0.0, databases = 0.0, dataAccess =  0.0;
        do {
            System.out.println("Enter the programming grade:");
            programming = sc.nextDouble();
            if (programming < 0 || programming > 10) {
                System.out.println("The score must be between 0 and 10.");
            }
        } while (programming < 0 || programming > 10);
        do {
            System.out.println("Enter the databases grade:");
            databases = sc.nextDouble();
            if (databases < 0 || databases > 10) {
                System.out.println("The score must be between 0 and 10.");
            }
        } while (databases < 0 || databases > 10);
        do {
            System.out.println("Enter the data access grade:");
            dataAccess = sc.nextDouble();
            if (dataAccess < 0 || dataAccess > 10) {
                System.out.println("The score must be between 0 and 10.");
            }
        } while (dataAccess < 0 || dataAccess > 10);
        sc.close();
        average = (programming + databases + dataAccess) / 3;
        System.out.println("The average grade is: " + dc.format(average));
        // variable = condition ? if true: if false
        state = average >= 5 ? "approved" : "suspended";
        System.out.println("State: " + state);
    }
}
