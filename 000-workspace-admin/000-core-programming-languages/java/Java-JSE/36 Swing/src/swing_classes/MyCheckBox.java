package swing_classes;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class MyCheckBox extends JFrame {
    public MyCheckBox() {
        setTitle("My Swing CheckBox");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JCheckBox checkBox = new JCheckBox("Check Me");
        add(checkBox);

        setVisible(true);
    }

    public static void main(String[] args) {
        new MyCheckBox();
    }
}
