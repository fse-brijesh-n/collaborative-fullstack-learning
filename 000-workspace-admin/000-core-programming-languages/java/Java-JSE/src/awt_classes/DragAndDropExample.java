package awt_classes;
import java.awt.Frame;
import java.awt.Button;
import java.awt.dnd.DragGestureEvent;
import java.awt.dnd.DragGestureListener;
import java.awt.dnd.DragGestureRecognizer;
import java.awt.dnd.DragSource;
import java.awt.dnd.DragSourceDragEvent;
import java.awt.dnd.DragSourceDropEvent;
import java.awt.dnd.DragSourceEvent;
import java.awt.dnd.DragSourceListener;
import java.awt.dnd.DropTarget;
import java.awt.dnd.DropTargetAdapter;
import java.awt.dnd.DropTargetDropEvent;
import java.awt.dnd.DropTargetEvent;
import java.awt.dnd.DropTargetListener;
import java.awt.dnd.DnDConstants;
import java.awt.Component;

public class DragAndDropExample {
    public static void main(String[] args) {
        Frame frame = new Frame("My Frame");
        frame.setSize(300, 200);

        DragSource dragSource = DragSource.getDefaultDragSource();
        DropTarget dropTarget = new DropTarget(frame, DnDConstants.ACTION_COPY, new DropTargetAdapter() {
            @Override
            public void drop(DropTargetDropEvent e) {
                System.out.println("Drop event occurred");
            }
        });

        Component component = new Button("Drag Me");
        DragGestureRecognizer recognizer = dragSource.createDefaultDragGestureRecognizer(component, DnDConstants.ACTION_COPY, new DragGestureListener() {
            @Override
            public void dragGestureRecognized(DragGestureEvent e) {
                System.out.println("Drag gesture occurred");
            }
        });

        frame.add(component);
        frame.setVisible(true);
    }
}
