import java.lang.reflect.Method;

public class GetClassMethod {
    public static void main(String[] args) {
        String text = "Hello World";
        Class stringClass = text.getClass();
        System.out.println("stringClass = " + stringClass);
        System.out.println("stringClass.getName() = " + stringClass.getName());
        System.out.println("stringClass.getSimpleName() = " + stringClass.getSimpleName());
        System.out.println("stringClass.getPackage() = " + stringClass.getPackage());
        System.out.println("stringClass.getPackageName() = " + stringClass.getPackageName());
        System.out.println("stringClass.getClass() = " + stringClass.getClass());
        System.out.println("stringClass.getSuperclass() = " + stringClass.getSuperclass());
        for (Method method : stringClass.getMethods()) {
            System.out.println("method.getName() = " + method.getName());
        }
        
        Integer number = 47;
        Class integerClass = number.getClass();
        Class objectClass = integerClass.getSuperclass().getSuperclass();
        System.out.println("\nintegerClass = " + integerClass);
        System.out.println("integerClass.getName() = " + integerClass.getName());
        System.out.println("integerClass.getSimpleName() = " + integerClass.getSimpleName());
        System.out.println("integerClass.getPackage() = " + integerClass.getPackage());
        System.out.println("integerClass.getPackageName() = " + integerClass.getPackageName());
        System.out.println("integerClass.getClass() = " + integerClass.getClass());
        System.out.println("integerClass.getSuperclass() = " + integerClass.getSuperclass());
        System.out.println("objectClass = " + objectClass);
        for (Method method : integerClass.getMethods()) {
            System.out.println("method.getName() = " + method.getName());
        }
        System.out.println();
        for (Method method : objectClass.getMethods()) {
            System.out.println("method.getName() = " + method.getName());
        }
    }
}
