package awt_classes;
import java.awt.Frame;
import java.awt.Point;

public class PointExample {
    public static void main(String[] args) {
        Frame frame = new Frame("My Frame");
        frame.setSize(300, 200);
        frame.setVisible(true);

        Point location = new Point(100, 100);
        frame.setLocation(location);
    }
}
