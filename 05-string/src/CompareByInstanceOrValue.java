public class CompareByInstanceOrValue {
    public static void main(String[] args) {
        String course1 = "Java Programming";
        String course2 = new String("Java Programming");
        String course3 = "Java Programming";
        // Compare by instance - object
        boolean isEqual = course1 == course2;
        System.out.println("course 1 = " + course1);
        System.out.println("course 2 = " + course2);
        System.out.println("course 3 = " + course3);
        System.out.println("Compare by object - course 1 equals course 2:" +
                "\ncourse1 == course2 = " + isEqual);
        // Compare by value
        isEqual = course1.equals(course2);
        System.out.println("Compare by value - course 1 equals course 2:" + "" +
                "\ncourse1.equals(course2) = " + isEqual);
        // Assign the existing reference of an object
        isEqual = course1 == course3;
        System.out.println("Assign the existing reference of an object:" +
                "\ncourse1 == course3 = " + isEqual);

    }
}
