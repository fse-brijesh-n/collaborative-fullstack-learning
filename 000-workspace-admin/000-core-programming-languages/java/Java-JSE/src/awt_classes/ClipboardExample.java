package awt_classes;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

public class ClipboardExample {
    public static void main(String[] args) {
        Frame frame = new Frame("My Frame");
        frame.setSize(300, 200);

        TextArea textArea = new TextArea();
        frame.add(textArea);

        String text = "Hello, Clipboard!";
        StringSelection selection = new StringSelection(text);
        Clipboard clipboard = frame.getToolkit().getSystemClipboard();
        clipboard.setContents(selection, null);

        frame.setVisible(true);
    }
}
