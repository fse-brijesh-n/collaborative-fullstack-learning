package swing_classes;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class MyComboBox extends JFrame {
    public MyComboBox() {
        setTitle("My Swing ComboBox");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] options = {"Option 1", "Option 2", "Option 3"};
        JComboBox<String> comboBox = new JComboBox<>(options);
        add(comboBox);

        setVisible(true);
    }

    public static void main(String[] args) {
        new MyComboBox();
    }
}
