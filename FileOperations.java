import java.io.*;

public class FileOperations {
    public static void main(String[] args) {
        try {
            File file = new File("sample.txt");

            // Create file
            file.createNewFile();

            // Write to file
            FileWriter writer = new FileWriter(file);
            writer.write("Hello, Java File Handling!");
            writer.close();

            // Read from file
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();

            // Append to file
            FileWriter append = new FileWriter(file, true);
            append.write("\nThis is appended text.");
            append.close();

            System.out.println("File operations completed.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
