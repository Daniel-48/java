public class SortArrayStartEnd {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        int[] array = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        int aux = 0;
        for (int i = 0; i < numbers.length-i; i++) {
            System.out.print("numbers[" + i + "] = " + numbers[i] + " ");
            System.out.println("numbers[" + i + "] = " + numbers[numbers.length-1-i]);
            array[aux++] = numbers[i];
            array[aux++] =  numbers[numbers.length-1-i];
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println("array[" + i + "] = " + array[i]);
        }
    }
}
