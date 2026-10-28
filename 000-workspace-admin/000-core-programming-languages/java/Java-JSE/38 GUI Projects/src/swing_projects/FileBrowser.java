package swing_projects;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;

public class FileBrowser extends JFrame {
    private JList<String> fileList;
    private DefaultListModel<String> listModel;

    public FileBrowser() {
        setTitle("File Browser");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new BorderLayout());

        // File list
        listModel = new DefaultListModel<>();
        fileList = new JList<>(listModel);
        JScrollPane scrollPane = new JScrollPane(fileList);
        panel.add(scrollPane, BorderLayout.CENTER);

        // Button to load files
        JButton loadButton = new JButton("Load Files");
        loadButton.addActionListener(new LoadButtonActionListener());
        panel.add(loadButton, BorderLayout.SOUTH);

        add(panel);

        setVisible(true);
    }

    private class LoadButtonActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
            int result = fileChooser.showOpenDialog(FileBrowser.this);

            if (result == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();
                listFiles(selectedFile);
            }
        }
    }

    private void listFiles(File file) {
        listModel.clear();

        if (file.isDirectory()) {
            File[] files = file.listFiles();
            if (files != null) {
                for (File f : files) {
                    listModel.addElement(f.getName());
                }
            }
        } else {
            listModel.addElement(file.getName());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new FileBrowser();
        });
    }
}
