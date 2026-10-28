import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Scanner;

public class PrintOutStream {

    public static void main(String[] args) {
        try (PrintStream out = new PrintStream(System.out);
             InputStreamReader in = new InputStreamReader(System.in);
             BufferedReader bf = new BufferedReader(in)) {

            // Input using InputStreamReader directly
            out.println("Enter a character:");
            int charInput = in.read(); // Reads a single character
            out.println("ASCII Value of the character: " + charInput);

//            // Clear the buffer after using InputStreamReader
//            bf.readLine(); // Consume the newline character left in the buffer

            // Input using BufferedReader
            out.println("if buffer not clear then Enter a string:");
            String bufferedInput = bf.readLine();
            out.println("You entered: " + bufferedInput);

            // Clearing the buffer using StringBuffer
            StringBuffer strBuffer = new StringBuffer(bufferedInput);
            out.println("Clearing the buffer...");
            strBuffer.delete(0, strBuffer.length());
            out.println("Buffer cleared.");
            out.println("afert clear the buffer ASCII Value of the character: " + strBuffer);
            // Input a number using BufferedReader
            out.println("after clearing the buffer Enter a number:");
            int bufferedNumber = Integer.parseInt(bf.readLine());
            out.println("You entered: " + bufferedNumber);

            // Input using Scanner
            Scanner scanner = new Scanner(System.in);
            out.println("Enter another number:");
            int scannerNumber = scanner.nextInt();
            out.println("You entered: " + scannerNumber);

       

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
