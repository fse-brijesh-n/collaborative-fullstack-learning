package awt_classes;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;

public class MediaTrackerExample {
    public static void main(String[] args) {
        Frame frame = new Frame("My Frame") {
            @Override
            public void paint(Graphics g) {
                Image image = Toolkit.getDefaultToolkit().getImage("path/to/image.jpg");
                MediaTracker mediaTracker = new MediaTracker(this);
                mediaTracker.addImage(image, 0);

                try {
                    mediaTracker.waitForAll();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                g.drawImage(image, 0, 0, this);
            }
        };
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
