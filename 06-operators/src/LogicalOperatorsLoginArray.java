import java.util.Scanner;

public class LogicalOperatorsLoginArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /**
        int numberOfItems = 3;
        String[] usernames = new String[numberOfItems];
        String[] passwords = new String[numberOfItems];
        usernames[0] = "admin";
        passwords[0] = "admin";
        usernames[1] = "daniel";
        passwords[1] = "123456";
        usernames[2] = "emma";
        passwords[2] = "654321";
        */
        String[] usernames = {"admin", "daniel", "emma"};
        String[] passwords = {"admin", "123456", "654321"};
        System.out.println("Enter username:");
        String user = sc.nextLine();
        System.out.println("Enter password:");
        String key = sc.nextLine();
        sc.close();
        boolean isAuthenticated = false;
        for (int i = 0; i < usernames.length; i++) {
            if (usernames[i].equals(user) && passwords[i].equals(key)) {
                isAuthenticated = true;
                break;
            }
        }
        if (isAuthenticated) {
            System.out.println("Access allowed");
            System.out.println("Hello ".concat(String.valueOf(user.toUpperCase().charAt(0))).concat(user.substring(1)));
        } else {
            System.out.println("Access denied");
            System.out.println("incorrect username or password");
        }
    }
}
