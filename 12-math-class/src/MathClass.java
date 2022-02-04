import java.text.DecimalFormat;

public class MathClass {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.00");
        int absolute = Math.abs(-6);
        System.out.println("absolute = " + absolute);
        absolute = Math.abs(6);
        System.out.println("absolute = " + absolute);
        double max = Math.max(47.6, 39.1);
        System.out.println("max = " + max);
        double min = Math.min(47.6, 39.1);
        System.out.println("min = " + min);
        double maxDecimalValue = Math.ceil(47.3);
        System.out.println("maxDecimalValue = " + maxDecimalValue);
        double minDecimalValue = Math.floor(47.6);
        System.out.println("minDecimalValue = " + minDecimalValue);
        double integer = Math.round(3.6);
        System.out.println("integer = " + integer);
        double pi = Math.PI;
        System.out.println("pi = " + pi);
        double exp = Math.exp(2);
        System.out.println("exp = " + exp);
        double log = Math.log(10);
        System.out.println("log = " + log);
        double pow = Math.pow(10, 3);
        System.out.println("pow = " + pow);
        double squareRoot = Math.sqrt(8);
        System.out.println("squareRoot = " + squareRoot);
        System.out.println("Trigonometry");
        double degrees = Math.toDegrees(1.57);
        degrees = Math.round(degrees);
        System.out.println("Convert radians to degrees = " + degrees);
        double radians = Math.toRadians(90d);
        System.out.println("Convert degrees to radians = " + df.format(radians));
        System.out.println("sin(90) = " + Math.sin(radians));
        System.out.println("cos(90) = " + Math.cos(radians));
    }
}
