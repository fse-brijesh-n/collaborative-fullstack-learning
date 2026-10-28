package awt_classes;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

public class MenuExample {
    public static void main(String[] args) {
        Frame frame = new Frame("My Frame");
        MenuBar menuBar = new MenuBar();
        frame.setMenuBar(menuBar);

        Menu fileMenu = new Menu("File");
        menuBar.add(fileMenu);

        MenuItem newItem = new MenuItem("New");
        fileMenu.add(newItem);

        MenuItem openItem = new MenuItem("Open");
        fileMenu.add(openItem);

        MenuItem saveItem = new MenuItem("Save");
        fileMenu.add(saveItem);

        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
