package awt_classes;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class RenderingHintsExample {
    public static void main(String[] args) {
        Frame frame = new Frame("My Frame") {
            @Override
            public void paint(Graphics g) {
                Graphics2D g2d = (Graphics2D) g;
                g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BICUBIC);

                g2d.drawLine(50, 50, 200, 200);
            }
        };
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
