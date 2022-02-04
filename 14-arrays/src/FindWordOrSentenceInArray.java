import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class FindWordOrSentenceInArray {
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String RESET = "\u001B[0m";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int elements;

        try {
            elements = readPositiveNumber("Enter the number of elements in the array:");
            String[] array = new String[elements];
            for (int i = 0; i < array.length; i++) {
                System.out.print("Enter a name in index [" + i + "]: ");
                array[i] = sc.nextLine();
            }
            System.out.println("Enter the word or sentence to search for in the array:");
            String wordOrSentence = sc.nextLine();
            
            List arrayToList = Arrays.asList(array);

            if (containsCaseInsensitive(wordOrSentence, arrayToList)) {
                System.out.println("The word or sentence " + GREEN + "'" + wordOrSentence + "'" + RESET +  " has been found" + RESET);
            } else {
                System.out.println("The name " + GREEN + "'" + wordOrSentence + "'" + RESET + " has not been found in the array");
            }

        } catch (InputMismatchException e) {
            System.out.println(RED + "You must enter a numeric value" + RESET);
            main(args);
            System.exit(0);
        }
        sc.close();
    }
    public static int readPositiveNumber(String message) {
        Scanner sc = new Scanner(System.in);
        int number;

        do {
            System.out.println(message);
            number = sc.nextInt();
        } while (number <= 0);

        return number;
    }

    public static boolean containsCaseInsensitive(String s, List<String> l){
        return l.stream().anyMatch(x -> x.equalsIgnoreCase(s));
    }
}
