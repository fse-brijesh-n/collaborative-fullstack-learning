package awt_classes;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;

public class FontExample {
    public static void main(String[] args) {
        Frame frame = new Frame("My Frame");
        frame.setSize(300, 200);
        frame.setVisible(true);

        Graphics g = frame.getGraphics();
        Font font = new Font("Arial", Font.BOLD, 20);
        g.setFont(font);
        g.drawString("Hello, World!", 50, 50);
    }
}
