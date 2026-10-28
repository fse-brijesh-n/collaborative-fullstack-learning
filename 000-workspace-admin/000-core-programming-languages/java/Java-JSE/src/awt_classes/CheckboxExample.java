package awt_classes;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Frame;

public class CheckboxExample {
    public static void main(String[] args) {
        Frame frame = new Frame("My Frame");
        frame.setSize(300, 200);

        CheckboxGroup checkboxGroup = new CheckboxGroup();

        Checkbox checkbox1 = new Checkbox("Option 1", checkboxGroup, false);
        frame.add(checkbox1);

        Checkbox checkbox2 = new Checkbox("Option 2", checkboxGroup, true);
        frame.add(checkbox2);

        frame.setVisible(true);
    }
}
