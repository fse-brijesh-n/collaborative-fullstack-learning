package awt_projects;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;

class Contact implements Serializable {
    private String name;
    private String phone;
    private String email;
    private String notes;

    public Contact(String name, String phone, String email, String notes) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.notes = notes;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getNotes() {
        return notes;
    }
}

public class PersonalInformationManager extends Frame {
    private TextField nameField, phoneField, emailField, searchField;
    private TextArea notesArea;
    private List contactList;

    private ArrayList<Contact> contacts;

    public PersonalInformationManager() {
        contacts = new ArrayList<>();

        // Set frame properties
        setTitle("Personal Information Manager");
        setSize(600, 400);
        setLayout(new BorderLayout());

        // Create input panel
        Panel inputPanel = new Panel(new GridLayout(5, 2, 10, 10));
        inputPanel.add(new Label("Name:"));
        nameField = new TextField(20);
        inputPanel.add(nameField);
        inputPanel.add(new Label("Phone:"));
        phoneField = new TextField(20);
        inputPanel.add(phoneField);
        inputPanel.add(new Label("Email:"));
        emailField = new TextField(20);
        inputPanel.add(emailField);
        inputPanel.add(new Label("Notes:"));
        notesArea = new TextArea(5, 20);
        inputPanel.add(notesArea);
        Button saveButton = new Button("Save");
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveContact();
            }
        });
        inputPanel.add(saveButton);

        // Create contact list panel
        Panel listPanel = new Panel(new BorderLayout());
        contactList = new List();
        contactList.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                int selectedIndex = contactList.getSelectedIndex();
                if (selectedIndex >= 0) {
                    Contact selectedContact = contacts.get(selectedIndex);
                    displayContactDetails(selectedContact);
                }
            }
        });
        listPanel.add(contactList, BorderLayout.CENTER);
        Button deleteButton = new Button("Delete");
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteContact();
            }
        });
        listPanel.add(deleteButton, BorderLayout.SOUTH);

        // Create search panel
        Panel searchPanel = new Panel(new FlowLayout());
        searchPanel.add(new Label("Search:"));
        searchField = new TextField(20);
        searchField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                searchContacts(searchField.getText());
            }
        });
        searchPanel.add(searchField);

        // Add panels to the frame
        add(inputPanel, BorderLayout.NORTH);
        add(listPanel, BorderLayout.CENTER);
        add(searchPanel, BorderLayout.SOUTH);

        // Load contacts from file
        loadContacts();

        // Window listener to save contacts and close the application
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                saveContacts();
                System.exit(0);
            }
        });
    }

    private void saveContact() {
        String name = nameField.getText();
        String phone = phoneField.getText();
        String email = emailField.getText();
        String notes = notesArea.getText();

        Contact contact = new Contact(name, phone, email, notes);
        contacts.add(contact);
        contactList.add(contact.getName());

        clearFields();
    }

    private void displayContactDetails(Contact contact) {
        nameField.setText(contact.getName());
        phoneField.setText(contact.getPhone());
        emailField.setText(contact.getEmail());
        notesArea.setText(contact.getNotes());
    }

    private void deleteContact() {
        int selectedIndex = contactList.getSelectedIndex();
        if (selectedIndex >= 0) {
            contacts.remove(selectedIndex);
            contactList.remove(selectedIndex);
            clearFields();
        }
    }

    private void searchContacts(String keyword) {
        contactList.removeAll();

        for (Contact contact : contacts) {
            if (contact.getName().toLowerCase().contains(keyword.toLowerCase())) {
                contactList.add(contact.getName());
            }
        }
    }

    private void clearFields() {
        nameField.setText("");
        phoneField.setText("");
        emailField.setText("");
        notesArea.setText("");
    }

    private void saveContacts() {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("contacts.dat"))) {
            outputStream.writeObject(contacts);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void loadContacts() {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("contacts.dat"))) {
            ArrayList<Contact> loadedContacts = (ArrayList<Contact>) inputStream.readObject();
            if (loadedContacts != null) {
                contacts = loadedContacts;
                for (Contact contact : contacts) {
                    contactList.add(contact.getName());
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        PersonalInformationManager manager = new PersonalInformationManager();
        manager.setVisible(true);
    }
}
