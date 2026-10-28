package awt_classes;
import java.awt.Frame;
import java.awt.Rectangle;

public class RectangleExample {
    public static void main(String[] args) {
        Frame frame = new Frame("My Frame");
        frame.setSize(300, 200);
        frame.setVisible(true);

        Rectangle bounds = new Rectangle(100, 100, 200, 150);
        frame.setBounds(bounds);
    }
}
