package awt_classes;
import java.awt.Frame;
import java.awt.Scrollbar;

public class ScrollbarExample {
    public static void main(String[] args) {
        Frame frame = new Frame("My Frame");
        Scrollbar scrollbar = new Scrollbar(Scrollbar.HORIZONTAL);
        frame.add(scrollbar);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
