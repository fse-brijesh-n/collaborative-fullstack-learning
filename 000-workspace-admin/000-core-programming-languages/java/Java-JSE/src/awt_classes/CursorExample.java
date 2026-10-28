package awt_classes;
import java.awt.Cursor;
import java.awt.Frame;
import java.awt.Point;
import java.awt.Toolkit;

public class CursorExample {
    public static void main(String[] args) {
        Frame frame = new Frame("My Frame");
        frame.setSize(300, 200);
        frame.setVisible(true);

        Cursor cursor = Cursor.getPredefinedCursor(Cursor.HAND_CURSOR);
        frame.setCursor(cursor);
    }
}
