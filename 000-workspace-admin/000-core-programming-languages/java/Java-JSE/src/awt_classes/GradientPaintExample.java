package awt_classes;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class GradientPaintExample {
    public static void main(String[] args) {
        Frame frame = new Frame("My Frame") {
            @Override
            public void paint(Graphics g) {
                Graphics2D g2d = (Graphics2D) g;
                g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

                Color startColor = Color.RED;
                Color endColor = Color.YELLOW;
                GradientPaint gradientPaint = new GradientPaint(50, 50, startColor, 150, 150, endColor);
                g2d.setPaint(gradientPaint);
                g2d.fillRect(50, 50, 100, 100);
            }
        };
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
