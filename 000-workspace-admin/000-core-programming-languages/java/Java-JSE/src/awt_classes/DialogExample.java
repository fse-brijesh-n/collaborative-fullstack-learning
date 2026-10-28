package awt_classes;
import java.awt.Button;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;

public class DialogExample {
    public static void main(String[] args) {
        Frame frame = new Frame("My Frame");
        frame.setSize(300, 200);
        frame.setVisible(true);

        Dialog dialog = new Dialog(frame, "My Dialog", true);
        dialog.setLayout(new BorderLayout());

        Label label = new Label("This is a dialog");
        dialog.add(label, BorderLayout.CENTER);

        Button closeButton = new Button("Close");
        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dialog.dispose();
            }
        });
        dialog.add(closeButton, BorderLayout.SOUTH);

        dialog.setSize(200, 150);
        dialog.setVisible(true);
    }
}
