package swing_classes;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MyTextArea extends JFrame {
    public MyTextArea() {
        setTitle("My Swing TextArea");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextArea textArea = new JTextArea();
        textArea.setColumns(20);
        textArea.setRows(5);
        add(textArea);

        setVisible(true);
    }

    public static void main(String[] args) {
        new MyTextArea();
    }
}
