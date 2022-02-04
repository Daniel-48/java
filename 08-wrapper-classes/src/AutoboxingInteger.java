import java.util.ArrayList;
import java.util.List;

public class AutoboxingInteger {
    public static void main(String[] args) {
        int sum = 0;
        Integer[] integers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        List<Integer> evenIntegers = new ArrayList<>();
        List<Integer> oddIntegers = new ArrayList<>();

        System.out.println("Integer array numbers");
        for (Integer i : integers) {
            System.out.print("[" + i + "]");
        }
        for (Integer i : integers) {
            sum += i.intValue();
        }
        System.out.println("\nThe sum of all the numbers in the array is: " + sum);
        sum = 0;
        for (Integer i : integers) {
            sum += i;
        }
        System.out.println("The sum of all the numbers in the array is: " + sum);

        sum = 0;
        System.out.println("\nEven numbers of the array of integers");
        for (Integer i : integers) {
            if (i.intValue() % 2 == 0) {
                evenIntegers.add(i);
                sum += i.intValue();
            }
        }
        for (Integer i : evenIntegers) {
            System.out.print("[" + i + "]");
        }
        System.out.println("\nThe sum of the even numbers in the array is: " + sum);

        sum = 0;
        System.out.println("\nOdd numbers of the array of integers");
        for (Integer i : integers) {
            if (i.intValue() % 2 != 0) {
                oddIntegers.add(i);
                sum += i.intValue();
            }
        }
        for (Integer i : oddIntegers) {
            System.out.print("[" + i + "]");
        }
        System.out.println("\nThe sum of the odd numbers in the array is: " + sum);
    }
}
