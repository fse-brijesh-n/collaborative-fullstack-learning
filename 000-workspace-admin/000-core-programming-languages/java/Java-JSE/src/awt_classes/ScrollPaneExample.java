package awt_classes;
import java.awt.Frame;
import java.awt.Label;
import java.awt.ScrollPane;

public class ScrollPaneExample {
    public static void main(String[] args) {
        Frame frame = new Frame("My Frame");
        frame.setSize(300, 200);

        ScrollPane scrollPane = new ScrollPane();
        Label label = new Label("This is a long text that requires scrolling.");
        scrollPane.add(label);
        frame.add(scrollPane);

        frame.setVisible(true);
    }
}
