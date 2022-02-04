import javax.swing.*;

public class ForLoopFlowControlStatementArray {
    public static void main(String[] args) {
        /**
         * Control flow control structure for loop.
         * With the for loop you must know the limits of the iterations, that is, the initial value and the final value.
         */
        int[] numbers = {0,1,2,3,4,5,6,7,8,9};
        String[] names = {"Razvan","Gael", "Emma", "Daniel","Carmen"};
        int numberCounter = numbers.length, nameCounter = names.length;
        for (int i = 0; i < numberCounter; i++) {
            if (numbers[i] % 2 != 0) {
                continue;
            }
            System.out.println("Index " + i + ": " + numbers[i]);
        }
        System.out.println();
        for (int i = 0; i < nameCounter; i++) {
            if (names[i].toLowerCase().contains("razvan") ||
                    names[i].equalsIgnoreCase("carmen") ) {
                continue;
            }
            System.out.println("Index " + i + ": " + names[i]);
        }
        System.out.println();
        boolean found = false;
        String searchName = JOptionPane.showInputDialog("Enter the name to search:");
        for (int i = 0; i < nameCounter; i++) {
            if (names[i].equalsIgnoreCase(searchName)) {
                System.out.println(names[i] + " has been found");
                found = true;
                break;
            }
        }
        if (found) {
            JOptionPane.showMessageDialog(null, searchName + " has been found");
        } else {
            JOptionPane.showMessageDialog(null, searchName + " does not exist in the system");
        }
    }
}
