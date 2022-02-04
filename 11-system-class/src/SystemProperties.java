import java.util.Properties;

public class SystemProperties {
    public static void main(String[] args) {
        String username = System.getProperty("user.name");
        String home = System.getProperty("user.home");
        String workspace = System.getProperty("user.dir");
        String javaVersion = System.getProperty("java.version");
        String fileSeparator = System.getProperty("file.separator");
        String lineSeparator = System.getProperty("line.separator");

        System.out.println("username = " + username);
        System.out.println("home = " + home);
        System.out.println("workspace = " + workspace);
        System.out.println("java version = " + javaVersion);
        System.out.println("file separator = " + fileSeparator);
        System.out.println("line separator: " + lineSeparator + "A new line");

        System.out.println();
        Properties properties = System.getProperties();
        properties.list(System.out);
    }
}
