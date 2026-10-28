package awt_classes;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;

public class GridLayoutExample {
    public static void main(String[] args) {
        Frame frame = new Frame("My Frame");
        frame.setLayout(new GridLayout(2, 3));

        Button button1 = new Button("Button 1");
        frame.add(button1);

        Button button2 = new Button("Button 2");
        frame.add(button2);

        Button button3 = new Button("Button 3");
        frame.add(button3);

        Button button4 = new Button("Button 4");
        frame.add(button4);

        Button button5 = new Button("Button 5");
        frame.add(button5);

        Button button6 = new Button("Button 6");
        frame.add(button6);

        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
