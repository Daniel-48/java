import java.util.Scanner;

public class LogicalOperatorsLogin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username1 = "daniel", password1 = "123456", user, key;
        String username2 = "admin", password2 = "admin";
        System.out.println("Enter username:");
        user = sc.nextLine();
        System.out.println("Enter password:");
        key = sc.nextLine();
        sc.close();
        boolean isAuthenticated = false;
        if (username1.equals(user) && password1.equals(key) ||
                username2.equals(user) && password2.equals(key)) {
            isAuthenticated = true;
        } else {
            System.out.println("incorrect username or password");
        }
        if (isAuthenticated) {
            System.out.println("Access allowed");
            System.out.println("Hello ".concat(String.valueOf(user.toUpperCase().charAt(0))).concat(user.substring(1)));
        } else {
            System.out.println("Access denied");
        }
    }
}
