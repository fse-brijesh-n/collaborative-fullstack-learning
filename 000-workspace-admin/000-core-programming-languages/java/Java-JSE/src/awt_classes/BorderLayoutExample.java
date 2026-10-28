package awt_classes;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;

public class BorderLayoutExample {
    public static void main(String[] args) {
        Frame frame = new Frame("My Frame");
        frame.setLayout(new BorderLayout());

        Button button1 = new Button("North");
        frame.add(button1, BorderLayout.NORTH);

        Button button2 = new Button("South");
        frame.add(button2, BorderLayout.SOUTH);

        Button button3 = new Button("West");
        frame.add(button3, BorderLayout.WEST);

        Button button4 = new Button("East");
        frame.add(button4, BorderLayout.EAST);

        Button button5 = new Button("Center");
        frame.add(button5, BorderLayout.CENTER);

        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
