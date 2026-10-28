import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Scanner;

public class InputFromFileToFile{

    public static void main(String[] args) {
        try (PrintStream out = new PrintStream(System.out);
             InputStreamReader in = new InputStreamReader(System.in);
             BufferedReader bf = new BufferedReader(in)) {

            // File handling: Reading data from 'input.txt'
            String fileInput = "";
            out.println("Reading data from file 'input.txt':");
            try (BufferedReader fileReader = new BufferedReader(new FileReader("input.txt"))) {
                StringBuilder fileData = new StringBuilder();
                String line;
                while ((line = fileReader.readLine()) != null) {
                    out.println(line); // Displaying the file content
                    fileData.append(line).append("\n");
                }
                fileInput = fileData.toString().trim(); // Capture file data
            }

            // Interactive input (demonstrating multiple input methods)
            out.println("\nEnter a character:");
            int charInput = in.read(); // Reads a single character
            bf.readLine(); // Clear the buffer after reading a single character

            out.println("ASCII Value of the character: " + charInput);

            out.println("Enter a string:");
            String bufferedInput = bf.readLine();
            out.println("You entered: " + bufferedInput);

            out.println("Enter a number:");
            int bufferedNumber = Integer.parseInt(bf.readLine());
            out.println("You entered: " + bufferedNumber);

            Scanner scanner = new Scanner(System.in);
            out.println("Enter another number:");
            int scannerNumber = scanner.nextInt();
            out.println("You entered: " + scannerNumber);

            // File handling: Writing data to 'output.txt'
            out.println("\nWriting processed data to file 'output.txt':");
            try (FileWriter fileWriter = new FileWriter("output.txt")) {
                fileWriter.write("Content from 'input.txt':\n" + fileInput + "\n\n");
                fileWriter.write("ASCII Value of the character: " + charInput + "\n");
                fileWriter.write("String entered: " + bufferedInput + "\n");
                fileWriter.write("Number entered using BufferedReader: " + bufferedNumber + "\n");
                fileWriter.write("Number entered using Scanner: " + scannerNumber + "\n");
                out.println("Data successfully written to 'output.txt'.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
