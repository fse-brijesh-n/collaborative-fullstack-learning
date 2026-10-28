package swing_classes;
import javax.swing.JFrame;
import javax.swing.JButton;

public class MyButton extends JFrame {
    public MyButton() {
        setTitle("My Swing Button");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Click Me!");
        add(button);

        setVisible(true);
    }

    public static void main(String[] args) {
        new MyButton();
    }
}
