import java.util.Locale;

public class StringMethods {
    public static void main(String[] args) {
        String name = "Daniel";
        String developer = "developer";
        System.out.println("name = " + name);
        System.out.println("name.length() = " + name.length());
        System.out.println("name.toLowerCase() = " + name.toLowerCase());
        System.out.println("name.toUpperCase() = " + name.toUpperCase());
        System.out.println("name.equals(\"Daniel\") = " + name.equals("Daniel"));
        System.out.println("name.equals(\"daniel\") = " + name.equals("daniel"));
        System.out.println("name.equalsIgnoreCase(\"daniel\") = " + name.equalsIgnoreCase("daniel"));
        System.out.println("name.compareTo(\"Daniel\") = " + name.compareTo("Daniel"));
        System.out.println("name.compareTo(\"Gael\") = " + name.compareTo("Gael"));
        System.out.println("name.charAt(0) = " + name.charAt(0));
        System.out.println("name.charAt(name.length()-1) = " + name.charAt(name.length()-1));
        System.out.println("name.substring(0,4) = " + name.substring(0,4));
        System.out.println("name.substring(4) = " + name.substring(4));
        System.out.println("name.substring(name.length()-1) = " + name.substring(name.length()-1));

        System.out.println("developer = " + developer);
        System.out.println("developer.replace(\"e\", \"3\") = " + developer.replace("e", "3"));
        System.out.println("developer.indexOf(\"e\") = " + developer.indexOf("e"));
        System.out.println("developer.lastIndexOf(\"e\") = " + developer.lastIndexOf("e"));
        System.out.println("developer.indexOf(\"a\") = " + developer.indexOf("a"));
        System.out.println("developer.contains(\"d\") = " + developer.contains("d"));
        System.out.println("developer.contains(\"dev\") = " + developer.contains("dev"));
        System.out.println("developer.contains(\"a\") = " + developer.contains("a"));
        System.out.println("developer.startsWith(\"dev\") = " + developer.startsWith("dev"));
        System.out.println("developer.endsWith(\"er\") = " + developer.endsWith("er"));
        System.out.println("  Daniel  ".trim());

        // Convert a string to an array
        char[] array1 = developer.toCharArray();
        for (int i = 0; i < array1.length; i++)  {
            System.out.println("index " + i + ": " + array1[i]);
        }

        String[] array2 = developer.split("e");
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i]);
        }

        String file = "some-file.jpg";
        String[] fileArray = file.split("\\."); // Can also be used [.]
        System.out.println();
        for (int i = 0; i < fileArray.length; i++) {
            System.out.println(fileArray[i]);
        }
        System.out.println("extension = " + fileArray[fileArray.length-1]);
    }
}
