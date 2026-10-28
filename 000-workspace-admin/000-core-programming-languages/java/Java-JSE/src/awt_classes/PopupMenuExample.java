package awt_classes;
import java.awt.Frame;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PopupMenuExample {
    public static void main(String[] args) {
        Frame frame = new Frame("My Frame");
        frame.setSize(300, 200);

        PopupMenu popupMenu = new PopupMenu();
        MenuItem menuItem1 = new MenuItem("Option 1");
        menuItem1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Option 1 selected");
            }
        });
        popupMenu.add(menuItem1);

        MenuItem menuItem2 = new MenuItem("Option 2");
        menuItem2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Option 2 selected");
            }
        });
        popupMenu.add(menuItem2);

        frame.add(popupMenu);

        frame.setVisible(true);
    }
}
