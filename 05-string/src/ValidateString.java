import java.util.Locale;

public class ValidateString {
    public static void main(String[] args) {
        String course = null;
        boolean isNull = course == null;
        System.out.println("is null = " + isNull);
        if (isNull) {
            course = "Java Programming";
        }
        boolean isEmpty = course.isEmpty();
        System.out.println("is empty = " + isEmpty);
        if (!isEmpty) {
            System.out.println("Welcome to the course".concat(" ").concat(course));
            // System.out.println("Welcome to the course " + course);
        }
    }
}
