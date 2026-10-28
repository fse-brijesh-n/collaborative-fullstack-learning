package awt_classes;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

public class DesktopExample {
    public static void main(String[] args) {
        if (Desktop.isDesktopSupported()) {
            Desktop desktop = Desktop.getDesktop();
            try {
                desktop.open(new File("/home/mrjacks/Desktop/text1.txt"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
