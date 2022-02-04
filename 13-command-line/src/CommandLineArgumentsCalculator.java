public class CommandLineArgumentsCalculator {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Please enter the operation (sum, subtraction, multiplication or division)" +
                    " and two numbers");
            System.exit(-1);
        }
        String operation = args[0];
        int a = 0, b = 0;
        double result = 0;
        try {
            a = Integer.parseInt(args[1]);
            b = Integer.parseInt(args[2]);
            result = 0;
        } catch (NumberFormatException e) {
            System.err.println("Variables 'a' and 'b' must be integers");
            System.exit(-1);
        }

        switch (operation) {
            case "sum":
                result = a + b;
                break;
            case "subtraction":
                result = a - b;
                break;
            case "multiplication":
                result = a * b;
                break;
            case "division":
                if (b == 0) {
                    System.out.println("Can't be divided by zero");
                    System.exit(-1);
                }
                result = (double) a / b;
                break;
            default:
                System.out.println("Unknown operation");
                break;
        }
        System.out.println("result = " + result);
    }
}
