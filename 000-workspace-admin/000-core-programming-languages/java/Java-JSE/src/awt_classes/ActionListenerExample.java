package awt_classes;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionListenerExample {
    public static void main(String[] args) {
        Frame frame = new Frame("My Frame");
        Button button = new Button("Click me");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button clicked");
            }
        });
        frame.add(button);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
