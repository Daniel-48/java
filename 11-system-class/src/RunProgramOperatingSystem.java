import java.io.IOException;

public class RunProgramOperatingSystem {
    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();
        Process process;

        try {
            if (System.getProperty("os.name").toLowerCase().startsWith("windows")) {
                process = rt.exec("notepad");
            } else if (System.getProperty("os.name").toLowerCase().startsWith("mac")) {
                process = rt.exec("textedit");
            } else {
                process = rt.exec("gedit");
            }
            process.waitFor();
        } catch (IOException e) {
            System.err.println("Unknown command: " + e.getMessage());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Text editor closed");
    }
}
