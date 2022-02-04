import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Make an algorithm that performs the horoscope, that is to say, given a date of birth with a month and day format, answer the sign of the horoscope corresponding horoscope sign
 */

/**
 * Hacer un algoritmo que realice el horóscopo, es decir, dada una fecha de nacimiento con formato de mes y día responda el signo del horóscopo correspondiente
 */

public class Exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = 0;
        String month;
        String[] months = {
                "January",
                "February",
                "March",
                "April",
                "May",
                "June",
                "July",
                "August",
                "September",
                "October",
                "November",
                "December"
        };

        System.out.println("This programme will tell you your horoscope based on your date of birth");
        System.out.println("Please enter the name of the month:");
        month = sc.nextLine();
        try {
            do {
                System.out.println("Please enter the day of the month:");
                day = sc.nextInt();
                if (day < 1 || day > 31) {
                    System.out.println("The day must be between 1 and 31 both included");
                    System.out.println("Please enter the day of the month:");
                    day = sc.nextInt();
                }
            } while (day < 1 || day > 31);
        } catch (InputMismatchException e) {
            System.out.println("You must enter a numeric value");
            main(args);
            System.exit(0);
        }
        sc.close();
        month = month.toUpperCase().charAt(0) + month.substring(1).toLowerCase();
        System.out.println("The month is " + month);
        System.out.println("The day of the month is " + day);
        switch (month) {
            case "January":
                if (day < 20) {
                    System.out.println("Your horoscope is Capricorn");
                } else {
                    System.out.println("Your horoscope is Aquarius");
                }
                break;
            case "February":
                if (day < 19) {
                    System.out.println("Your horoscope is Aquarius");
                } else {
                    System.out.println("Your horoscope is Pisces");
                }
                break;
            case "March":
                if (day < 21) {
                    System.out.println("Your horoscope is Pisces");
                } else {
                    System.out.println("Your horoscope is Aries");
                }
                break;
            case "April":
                if (day < 20) {
                    System.out.println("Your horoscope is Aries");
                } else {
                    System.out.println("Your horoscope is Taurus");
                }
                break;
            case "May":
                if (day < 21) {
                    System.out.println("Your horoscope is Taurus");
                } else {
                    System.out.println("Your horoscope is Gemini");
                }
                break;
            case "June":
                if (day < 21) {
                    System.out.println("Your horoscope is Gemini");
                } else {
                    System.out.println("Your horoscope is Cancer");
                }
                break;
            case "July":
                if (day < 22) {
                    System.out.println("Your horoscope is Cancer");
                } else {
                    System.out.println("Your horoscope is Leo");
                }
                break;
            case "August":
                if (day < 23) {
                    System.out.println("Your horoscope is Leo");
                } else {
                    System.out.println("Your horoscope is Virgo");
                }
                break;
            case "September":
                if (day < 23) {
                    System.out.println("Your horoscope is Virgo");
                } else {
                    System.out.println("Your horoscope is Libra");
                }
                break;
            case "October":
                if (day < 23) {
                    System.out.println("Your horoscope is Libra");
                } else {
                    System.out.println("Your horoscope is Scorpio");
                }
                break;
            case "November":
                if (day < 21) {
                    System.out.println("Your horoscope is Scorpio");
                } else {
                    System.out.println("Your horoscope is Sagittarius");
                }
                break;
            case "December":
                if (day < 21) {
                    System.out.println("Your horoscope is Sagittarius");
                } else {
                    System.out.println("Your horoscope is Capricorn");
                }
                break;
            default:
                System.out.println("Unknown month");
                System.out.println("Valid months are:");
                for (int i = 0; i < months.length; i++) {
                    System.out.print("[" + months[i] + "]");
                }
                break;
        }
    }
}
