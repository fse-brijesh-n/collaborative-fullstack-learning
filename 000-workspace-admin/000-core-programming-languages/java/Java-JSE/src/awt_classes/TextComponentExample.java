package awt_classes;
import java.awt.Frame;
import java.awt.TextField;

public class TextComponentExample {
    public static void main(String[] args) {
        Frame frame = new Frame("My Frame");
        frame.setSize(300, 200);

        TextField textField = new TextField();
        frame.add(textField);

        frame.setVisible(true);
    }
}
