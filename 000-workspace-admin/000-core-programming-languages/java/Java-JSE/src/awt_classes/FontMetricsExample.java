package awt_classes;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Frame;
import java.awt.Graphics;

public class FontMetricsExample {
    public static void main(String[] args) {
        Frame frame = new Frame("My Frame");
        frame.setSize(300, 200);
        frame.setVisible(true);

        Graphics g = frame.getGraphics();
        Font font = new Font("Arial", Font.PLAIN, 20);
        g.setFont(font);

        FontMetrics fontMetrics = g.getFontMetrics();
        int stringWidth = fontMetrics.stringWidth("Hello, World!");
        int stringHeight = fontMetrics.getHeight();

        g.drawString("Hello, World!", (frame.getWidth() - stringWidth) / 2, (frame.getHeight() - stringHeight) / 2);
    }
}
