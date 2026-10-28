package awt_classes;
import java.awt.Panel;
import java.awt.Frame;

public class PanelExample {
    public static void main(String[] args) {
        Frame frame = new Frame("My Frame");
        Panel panel = new Panel();
        frame.add(panel);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
