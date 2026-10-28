package swing_classes;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyLabel extends JFrame {
    public MyLabel() {
        setTitle("My Swing Label");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Hello, World!");
        add(label);

        setVisible(true);
    }

    public static void main(String[] args) {
        new MyLabel();
    }
}
