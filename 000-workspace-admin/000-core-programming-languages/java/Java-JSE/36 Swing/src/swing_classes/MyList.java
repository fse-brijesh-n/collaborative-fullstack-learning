package swing_classes;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class MyList extends JFrame {
    public MyList() {
        setTitle("My Swing List");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] items = {"Item 1", "Item 2", "Item 3"};
        JList<String> list = new JList<>(items);
        JScrollPane scrollPane = new JScrollPane(list);
        add(scrollPane);

        setVisible(true);
    }

    public static void main(String[] args) {
        new MyList();
    }
}
