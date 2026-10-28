package awt_classes;
import java.awt.Frame;
import java.awt.Window;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WindowExample {
    public static void main(String[] args) {
        Frame frame = new Frame("My Frame");
        frame.setSize(300, 200);

        Window window = new Window(frame);
        window.setSize(200, 100);
        window.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {
                System.out.println("Window Opened");
            }

            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("Window Closing");
            }

            @Override
            public void windowClosed(WindowEvent e) {
                System.out.println("Window Closed");
            }

            @Override
            public void windowIconified(WindowEvent e) {
                System.out.println("Window Iconified");
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                System.out.println("Window Deiconified");
            }

            @Override
            public void windowActivated(WindowEvent e) {
                System.out.println("Window Activated");
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                System.out.println("Window Deactivated");
            }
        });

        window.setVisible(true);
    }
}
