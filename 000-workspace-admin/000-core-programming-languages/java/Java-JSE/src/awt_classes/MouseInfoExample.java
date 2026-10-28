package awt_classes;
import java.awt.Frame;
import java.awt.MouseInfo;
import java.awt.PointerInfo;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseInfoExample {
    public static void main(String[] args) {
        Frame frame = new Frame("My Frame");
        frame.setSize(300, 200);

        frame.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                PointerInfo pointerInfo = MouseInfo.getPointerInfo();
                int x = pointerInfo.getLocation().x;
                int y = pointerInfo.getLocation().y;
                System.out.println("Mouse Clicked at: (" + x + ", " + y + ")");
            }
        });

        frame.setVisible(true);
    }
}
