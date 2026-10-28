package awt_classes;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.PrintJob;

public class PrintJobExample {
    public static void main(String[] args) {
        Frame frame = new Frame("My Frame") {
            @Override
            public void print(Graphics g) {
                g.drawString("Hello, Printer!", 100, 100);
            }
        };
        frame.setSize(300, 200);

        PrintJob printJob = frame.getToolkit().getPrintJob(frame, "Print Job", null);
        if (printJob != null) {
            Graphics printGraphics = printJob.getGraphics();
            if (printGraphics != null) {
                frame.printAll(printGraphics);
                printGraphics.dispose();
            }
            printJob.end();
        }

        frame.setVisible(true);
    }
}
