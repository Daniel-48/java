import java.util.Map;

public class EnvironmentVariables {
    public static void main(String[] args) {
        Map<String,String> env = System.getenv();
        System.out.println("System environment variables = " + env);
        String username1 = System.getenv("USERNAME");
        System.out.println("username1 = " + username1);
        String javaHome = System.getenv("JAVA_HOME");
        System.out.println("javaHome = " + javaHome);
        String temp = System.getenv("TEMP");
        System.out.println("temp = " + temp);
        String path = System.getenv("Path");
        System.out.println("path = " + path);
        String username2 = env.get("USERNAME");
        System.out.println("username2 = " + username2);
        System.out.println("List of system environment variables");
        for (String key : env.keySet()) {
            System.out.println(key + " -> " + env.get(key));
        }
    }
}
