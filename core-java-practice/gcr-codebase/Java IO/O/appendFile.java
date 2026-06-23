import java.io.FileWriter;
import java.io.IOException;

public class appendFile {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("log.txt", true);

            fw.write("New Entry\n");

            fw.close();

            System.out.println("Data appended.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}