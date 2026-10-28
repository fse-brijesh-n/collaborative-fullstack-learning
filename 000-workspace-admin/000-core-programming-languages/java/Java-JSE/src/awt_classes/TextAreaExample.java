package awt_classes;
import java.awt.Frame;
import java.awt.TextArea;

public class TextAreaExample {
    public static void main(String[] args) {
        Frame frame = new Frame("My Frame");
        frame.setSize(300, 200);

        TextArea textArea = new TextArea();
        frame.add(textArea);

        frame.setVisible(true);
    }
}
