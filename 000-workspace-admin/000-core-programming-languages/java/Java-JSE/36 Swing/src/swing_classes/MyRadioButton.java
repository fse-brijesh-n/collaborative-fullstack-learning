package swing_classes;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class MyRadioButton extends JFrame {
    public MyRadioButton() {
        setTitle("My Swing RadioButton");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JRadioButton radioButton = new JRadioButton("Select Me");
        add(radioButton);

        setVisible(true);
    }

    public static void main(String[] args) {
        new MyRadioButton();
    }
}
