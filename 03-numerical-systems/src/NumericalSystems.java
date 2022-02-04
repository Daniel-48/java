import javax.swing.*;

public class NumericalSystems {
    public static void main(String[] args) {
        String str = JOptionPane.showInputDialog(null,"Enter a whole number");
        int decimal = 0;
        try {
            decimal = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "You must enter a whole number");
            main(args);
            System.exit(0);
        };
        System.out.println("decimal = " + decimal);

        String binary = "binary number of " + decimal + " = " + Integer.toBinaryString(decimal);
        String octal = "octal number of " + decimal + " = " +  Integer.toOctalString(decimal);
        String hexadecimal = "hexadecimal number of " + decimal + " = " +  Integer.toHexString(decimal);

        String message = binary;
        message += "\n" + octal;
        message += "\n" + hexadecimal;
        JOptionPane.showMessageDialog(null, message);
    }
}
