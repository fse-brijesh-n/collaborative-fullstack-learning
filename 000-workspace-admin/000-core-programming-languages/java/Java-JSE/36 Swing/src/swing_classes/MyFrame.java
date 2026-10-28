package swing_classes;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
    public MyFrame() {
        setTitle("My Swing Frame");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MyFrame();
    }
}
