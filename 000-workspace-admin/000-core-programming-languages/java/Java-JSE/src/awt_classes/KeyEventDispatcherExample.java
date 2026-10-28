package awt_classes;
import java.awt.Frame;
import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.TextField;
import java.awt.event.KeyEvent;

public class KeyEventDispatcherExample {
    public static void main(String[] args) {
        Frame frame = new Frame("My Frame");
        frame.setSize(300, 200);

        TextField textField = new TextField();
        frame.add(textField);

        KeyboardFocusManager focusManager = KeyboardFocusManager.getCurrentKeyboardFocusManager();
        focusManager.addKeyEventDispatcher(new KeyEventDispatcher() {
            @Override
            public boolean dispatchKeyEvent(KeyEvent e) {
                if (e.getID() == KeyEvent.KEY_PRESSED) {
                    System.out.println("Key Pressed: " + e.getKeyChar());
                }
                return false;
            }
        });

        frame.setVisible(true);
    }
}
