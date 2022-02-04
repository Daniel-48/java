import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class AssignSystemProperties {
    public static void main(String[] args) {
        try {
            FileInputStream file = new FileInputStream("src/configuration.properties");
            Properties properties = new Properties(System.getProperties());
            properties.load(file);
            properties.setProperty("custom.property", "Value stored in the properties object");
            System.setProperties(properties);
            System.out.println(System.getProperty("configuration.file"));
            System.out.println(System.getProperty("author.configuration"));
            System.out.println(System.getProperty("email.configuration"));
            System.out.println("properties.getProperty(\"custom.property\") = " + properties.getProperty("custom.property"));
            System.getProperties().list(System.out);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
