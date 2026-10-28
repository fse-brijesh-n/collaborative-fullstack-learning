package awt_classes;
import java.awt.*;
import java.awt.event.*;

public class AWTCoreProject {
    public static void main(String[] args) {
        // Create a frame for the application
        Frame frame = new Frame("AWT Core Project");
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());

        // Create a label
        Label label = new Label("Hello, AWT!");
        frame.add(label);

        // Create a button
        Button button = new Button("Click Me");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Button Clicked");
            }
        });
        frame.add(button);

        // Create a text field
        TextField textField = new TextField(20);
        textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    String text = textField.getText();
                    label.setText("Entered Text: " + text);
                }
            }
        });
        frame.add(textField);

        // Add a window listener to handle frame closing
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                // Exit the application
                System.exit(0);
            }
        });

        // Display the frame
        frame.setVisible(true);
    }
}
