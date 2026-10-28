package swing_classes;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyTextField extends JFrame {
    public MyTextField() {
        setTitle("My Swing TextField");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField textField = new JTextField();
        textField.setColumns(20);
        add(textField);

        setVisible(true);
    }

    public static void main(String[] args) {
        new MyTextField();
    }
}
