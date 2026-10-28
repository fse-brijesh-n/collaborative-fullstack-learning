package awt_classes;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

public class ColorExample {
    public static void main(String[] args) {
        Frame frame = new Frame("My Frame");
        frame.setSize(300, 200);
        frame.setVisible(true);

        Graphics g = frame.getGraphics();
        g.setColor(Color.RED);
        g.drawString("Hello, World!", 50, 50);
    }
}
