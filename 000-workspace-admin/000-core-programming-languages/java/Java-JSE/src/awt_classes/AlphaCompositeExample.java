package awt_classes;
import java.awt.AlphaComposite;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Color;

public class AlphaCompositeExample {
    public static void main(String[] args) {
        Frame frame = new Frame("My Frame") {
            @Override
            public void paint(Graphics g) {
                Graphics2D g2d = (Graphics2D) g;
                g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

                g2d.setColor(Color.RED);
                g2d.fillRect(50, 50, 100, 100);

                g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.5f));
                g2d.setColor(Color.BLUE);
                g2d.fillRect(100, 100, 100, 100);
            }
        };
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
