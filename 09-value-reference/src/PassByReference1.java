public class PassByReference1 {
    public static void main(String[] args) {
        int[] numbers = {0, 1, 2, 3, 4, 5, 6};

        System.out.println("Start of the main method");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Index[" + i + "] = " + numbers[i]);
        }
        System.out.println("Before invoking test method");
        test(numbers);
        System.out.println("After invoking test method");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Index[" + i + "] = " + numbers[i]);
        }
        System.out.println("End of main method");
    }

    public static void test(int[] array) {
        System.out.println("Start of the test method");
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] + 20;
        }
        System.out.println("End of test method");
    }
}
