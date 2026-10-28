package swing_classes;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyPanel extends JPanel {
    public MyPanel() {
        // Panel initialization and customization
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("My Swing Panel");
        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new MyPanel();
        frame.add(panel);
        
        frame.setVisible(true);
    }
}
