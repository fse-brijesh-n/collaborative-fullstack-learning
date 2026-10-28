package awt_classes;
import java.awt.Canvas;
import java.awt.Frame;
import java.awt.Graphics;

public class CanvasExample {
    public static void main(String[] args) {
        Frame frame = new Frame("My Frame");
        Canvas canvas = new Canvas() {
            @Override
            public void paint(Graphics g) {
                g.drawString("Hello, World!", 50, 50);
            }
        };
        frame.add(canvas);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
