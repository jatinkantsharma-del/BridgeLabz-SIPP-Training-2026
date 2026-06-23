import java.io.*;

public class SchoolResultPortal {
    public static void main(String[] args) {
        try (
            BufferedReader br = new BufferedReader(new FileReader("students.txt"));
            BufferedWriter bw = new BufferedWriter(
                    new FileWriter("report.txt", true))
        ) {
            String line;
            bw.write("\n===== REPORT CARD =====");
            bw.newLine();
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                String name = data[0];
                int total = 0;
                for (int i = 1; i < data.length; i++) {
                    total += Integer.parseInt(data[i]);
                }
                double average = (double) total / (data.length - 1);
                bw.write("Name: " + name);
                bw.newLine();
                bw.write("Average Marks: " + String.format("%.2f", average));
                bw.newLine();
                bw.write("----------------------");
                bw.newLine();
            }
            System.out.println("Report generated successfully!");
        }
        catch (FileNotFoundException e) {
            System.out.println("Error: students.txt file not found.");
        }
        catch (IOException e) {
            System.out.println("I/O Error: " + e.getMessage());
        }
    }
}
