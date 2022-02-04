import java.util.Scanner;

public class LogicalOperatorsLoginTernaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] usernames = {"admin", "daniel", "emma"};
        String[] passwords = {"admin", "123456", "654321"};
        System.out.println("Enter username:");
        String user = sc.nextLine();
        System.out.println("Enter password:");
        String key = sc.nextLine();
        sc.close();
        boolean isAuthenticated = false;
        for (int i = 0; i < usernames.length; i++) {
            isAuthenticated = (usernames[i].equals(user) && passwords[i].equals(key)) ? true : isAuthenticated;
        }
        String message = isAuthenticated ? "Access allowed\nHello "
                .concat(String.valueOf(user.toUpperCase().charAt(0))).concat(user.substring(1)) :
                "Access denied\nincorrect username or password";
        System.out.println(message);
    }
}
