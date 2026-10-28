package awt_classes;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class ImageExample {
    public static void main(String[] args) {
        Frame frame = new Frame("My Frame");
        frame.setSize(300, 200);
        frame.setVisible(true);

        Image image = Toolkit.getDefaultToolkit().getImage("path/to/image.png");
        Graphics g = frame.getGraphics();
        g.drawImage(image, 50, 50, frame);
    }
}
