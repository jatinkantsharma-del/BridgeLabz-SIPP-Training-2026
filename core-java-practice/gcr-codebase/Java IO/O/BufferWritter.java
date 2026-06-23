import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWritter {
    public static void main(String[] args) {
        try {
            BufferedWriter bw =
                    new BufferedWriter(new FileWriter("data.txt"));

            bw.write("First Line");
            bw.newLine();   // adds a new line

            bw.write("Second Line");
            bw.newLine();

            bw.write("Third Line");

            bw.close();

            System.out.println("File Written.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}