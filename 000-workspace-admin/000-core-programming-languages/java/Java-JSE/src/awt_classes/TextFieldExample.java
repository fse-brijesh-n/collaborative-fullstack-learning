package awt_classes;
import java.awt.Frame;
import java.awt.TextField;

public class TextFieldExample {
    public static void main(String[] args) {
        Frame frame = new Frame("My Frame");
        TextField textField = new TextField();
        frame.add(textField);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
