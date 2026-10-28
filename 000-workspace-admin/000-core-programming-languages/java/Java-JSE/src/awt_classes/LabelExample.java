package awt_classes;
import java.awt.Frame;
import java.awt.Label;

public class LabelExample {
    public static void main(String[] args) {
        Frame frame = new Frame("My Frame");
        Label label = new Label("Hello, World!");
        frame.add(label);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
