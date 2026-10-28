package awt_classes;
import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CardLayoutExample {
    public static void main(String[] args) {
        Frame frame = new Frame("My Frame");
        frame.setSize(300, 200);

        CardLayout cardLayout = new CardLayout();
        Panel cardPanel = new Panel(cardLayout);
        frame.add(cardPanel);

        Button button1 = new Button("Card 1");
        cardPanel.add(button1, "Card 1");

        Button button2 = new Button("Card 2");
        cardPanel.add(button2, "Card 2");

        Button button3 = new Button("Switch Card");
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.next(cardPanel);
            }
        });
        frame.add(button3);

        frame.setVisible(true);
    }
}
