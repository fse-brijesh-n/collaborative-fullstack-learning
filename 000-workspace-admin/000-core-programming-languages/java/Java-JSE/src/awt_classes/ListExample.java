package awt_classes;
import java.awt.Frame;
import java.awt.List;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ListExample {
    public static void main(String[] args) {
        Frame frame = new Frame("My Frame");
        frame.setSize(300, 200);

        List list = new List();
        list.add("Item 1");
        list.add("Item 2");
        list.add("Item 3");
        list.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    System.out.println("Selected: " + list.getSelectedItem());
                }
            }
        });
        frame.add(list);

        frame.setVisible(true);
    }
}
