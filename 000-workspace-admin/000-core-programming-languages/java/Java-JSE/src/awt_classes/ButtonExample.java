package awt_classes;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.FlowLayout;

public class ButtonExample {
    public static void main(String[] args) {
        Frame frame = new Frame("My Frame");
        Button button = new Button("Click me");
        frame.setLayout(new FlowLayout());
        frame.add(button);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
