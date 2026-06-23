import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("output.txt");

            fw.write("Hello, Java I/O!\n");
            fw.write("Welcome to FileWriter.");

            fw.close();

            System.out.println("Data written successfully.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}