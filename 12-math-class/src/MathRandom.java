import java.util.Random;

public class MathRandom {
    public static void main(String[] args) {
        double random = (Math.random() * 50 + 1);
        System.out.println("random = " + Math.round(random));
        String[] colors = {"Black", "White", "Green", "Blue", "Orange", "Gray"};
        random = (Math.random() * colors.length);
        for (String color : colors) {
            System.out.print("[" + color + "]");
        }
        System.out.println("\ncolors[(int) random] = " + colors[(int) random]);
        
        Random randomObject = new Random();
        int intRandom = randomObject.nextInt();
        System.out.println("intRandom = " + intRandom);
        // Generates a random value between zero and 50
        intRandom = randomObject.nextInt(51);
        System.out.println("intRandom = " + intRandom);
        // Generates a random value between 25 and 50
        intRandom = 25 + randomObject.nextInt(51 - 25);
        System.out.println("intRandom = " + intRandom);
        long longRandom = randomObject.nextLong();
        System.out.println("longRandom = " + longRandom);
        intRandom = randomObject.nextInt(colors.length);
        System.out.println("randomObject.nextInt(colors.length) = " + intRandom);
        System.out.println("color = " + colors[intRandom]);
    }
}
