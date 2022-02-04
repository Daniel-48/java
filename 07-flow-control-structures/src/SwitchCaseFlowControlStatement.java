import java.util.InputMismatchException;
import java.util.Scanner;

public class SwitchCaseFlowControlStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = 0;
        char c = 'a';
        String name = "Gael", nameOfMonth = "";

        try {
            do {
                System.out.println("Enter a number of month:");
                month = sc.nextInt();
                if (month < 1 || month > 12) {
                    System.out.println("You must enter a number between 1 and 12 both included");
                }
            } while (month < 1 || month > 12);
        } catch (InputMismatchException e) {
            System.out.println("Exception = " + e);
            main(args);
            System.exit(0);
        }

        switch (month) {
            case 1:
                nameOfMonth = "January";
                break;
            case 2:
                nameOfMonth = "February";
                break;
            case 3:
                nameOfMonth = "March";
                break;
            case 4:
                nameOfMonth = "April";
                break;
            case 5:
                nameOfMonth = "May";
                break;
            case 6:
                nameOfMonth = "June";
                break;
            case 7:
                nameOfMonth = "July";
                break;
            case 8:
                nameOfMonth = "August";
                break;
            case 9:
                nameOfMonth = "September";
                break;
            case 10:
                nameOfMonth = "October";
                break;
            case 11:
                nameOfMonth = "November";
                break;
            case 12:
                nameOfMonth = "December";
                break;
            default:
                System.out.println("Undefined");
                break;
        }

        System.out.println("Name of month = " + nameOfMonth);

        switch (c) {
            case 'a':
                System.out.println("The character is 'a'");
                break;
            case 'b':
                System.out.println("The character is 'b'");
                break;
            case 'c':
                System.out.println("The character is 'c'");
                break;
            default:
                System.out.println("You must enter a character between 'a' and 'c' both included");
                break;
        }

        switch (name) {
            case "Daniel":
                System.out.println("The name is Daniel");
                break;
            case "Emma":
                System.out.println("The name is Emma");
                break;
            case "Gael":
                System.out.println("The name is Gael");
                break;
            default:
                System.out.println("It's an unknown name");
                break;
        }
    }
}
