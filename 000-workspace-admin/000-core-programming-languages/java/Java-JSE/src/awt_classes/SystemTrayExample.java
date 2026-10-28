package awt_classes;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.SystemTray;
import java.awt.TrayIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.AWTException;

public class SystemTrayExample {
    public static void main(String[] args) {
        Frame frame = new Frame("My Frame");
        frame.setSize(300, 200);

        if (SystemTray.isSupported()) {
            SystemTray systemTray = SystemTray.getSystemTray();

            TrayIcon trayIcon = new TrayIcon(Toolkit.getDefaultToolkit().getImage("path/to/icon.png"));
            trayIcon.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    frame.setVisible(true);
                }
            });

            try {
                systemTray.add(trayIcon);
            } catch (AWTException e) {
                e.printStackTrace();
            }
        }

        frame.setVisible(true);
    }
}
