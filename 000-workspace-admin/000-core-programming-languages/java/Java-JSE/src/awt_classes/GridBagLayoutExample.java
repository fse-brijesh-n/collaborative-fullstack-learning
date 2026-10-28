package awt_classes;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

public class GridBagLayoutExample {
    public static void main(String[] args) {
        Frame frame = new Frame("My Frame");
        frame.setLayout(new GridBagLayout());

        Button button1 = new Button("Button 1");
        GridBagConstraints gbc1 = new GridBagConstraints();
        gbc1.gridx = 0;
        gbc1.gridy = 0;
        frame.add(button1, gbc1);

        Button button2 = new Button("Button 2");
        GridBagConstraints gbc2 = new GridBagConstraints();
        gbc2.gridx = 1;
        gbc2.gridy = 0;
        frame.add(button2, gbc2);

        Button button3 = new Button("Button 3");
        GridBagConstraints gbc3 = new GridBagConstraints();
        gbc3.gridx = 0;
        gbc3.gridy = 1;
        gbc3.gridwidth = 2;
        frame.add(button3, gbc3);

        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
