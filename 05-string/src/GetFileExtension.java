public class GetFileExtension {
    public static void main(String[] args) {
        String file = "some-image.jpg";
        int i = file.lastIndexOf(".");
        System.out.println("file.length() = " + file.length());
        System.out.println("file.substring(file.length()-3) = " + file.substring(file.length()-3));
        System.out.println("file.substring(i+1) = " + file.substring(i+1));
    }
}
