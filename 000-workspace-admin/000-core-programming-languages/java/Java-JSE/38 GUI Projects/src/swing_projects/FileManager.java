package swing_projects;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;

public class FileManager extends JFrame {
    private JTextField currentDirectoryField;
    private JList<String> fileList;
    private DefaultListModel<String> listModel;

    public FileManager() {
        setTitle("File Manager");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Current directory field
        currentDirectoryField = new JTextField();
        currentDirectoryField.setEditable(false);
        add(currentDirectoryField, BorderLayout.NORTH);

        // File list
        listModel = new DefaultListModel<>();
        fileList = new JList<>(listModel);
        JScrollPane scrollPane = new JScrollPane(fileList);
        add(scrollPane, BorderLayout.CENTER);

        // File list double-click listener
        fileList.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                if (evt.getClickCount() == 2) {
                    int index = fileList.locationToIndex(evt.getPoint());
                    String selectedFile = listModel.getElementAt(index);
                    navigateTo(selectedFile);
                }
            }
        });

        // Back button
        JButton backButton = new JButton("Back");
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                navigateUp();
            }
        });
        add(backButton, BorderLayout.SOUTH);

        setVisible(true);
        navigateTo(System.getProperty("user.home")); // Start at the user's home directory
    }

    private void navigateTo(String path) {
        File file = new File(path);

        if (file.exists() && file.isDirectory()) {
            currentDirectoryField.setText(file.getAbsolutePath());
            listModel.clear();

            File[] files = file.listFiles();
            if (files != null) {
                for (File f : files) {
                    listModel.addElement(f.getName());
                }
            }
        }
    }

    private void navigateUp() {
        String currentPath = currentDirectoryField.getText();
        File currentFile = new File(currentPath);

        if (currentFile.exists()) {
            File parent = currentFile.getParentFile();
            if (parent != null) {
                navigateTo(parent.getAbsolutePath());
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new FileManager();
        });
    }
}
