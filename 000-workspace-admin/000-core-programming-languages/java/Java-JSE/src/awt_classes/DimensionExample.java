package awt_classes;
import java.awt.Dimension;
import java.awt.Frame;

public class DimensionExample {
    public static void main(String[] args) {
        Frame frame = new Frame("My Frame");
        frame.setSize(new Dimension(300, 200));
        frame.setVisible(true);
    }
}
