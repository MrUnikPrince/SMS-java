import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class AppGUI1 extends JFrame {
    private JMenuBar menuBar;
    private JMenu studentMenu;
    private JMenuItem addStudentItem, deleteStudentItem, displayStudent, searchStudent, updateStudent;
    private Student addStudentPanel;
    

    public AppGUI1() {
        setTitle("Student Management System");

        // Create menu bar
        menuBar = new JMenuBar();

        // Create student menu
        studentMenu = new JMenu("Student");

        // Create menu items
        addStudentItem = new JMenuItem("Add Student");
        deleteStudentItem = new JMenuItem("Delete Student");
        updateStudent = new JMenuItem("Update Student");
        searchStudent = new JMenuItem("Search Student");
        displayStudent = new JMenuItem("Display Student");

        // Add menu items to student menu
        studentMenu.add(addStudentItem);
        studentMenu.add(deleteStudentItem);
        studentMenu.add(updateStudent);
        studentMenu.add(searchStudent);
        studentMenu.add(displayStudent);

        // Add student menu to menu bar
        menuBar.add(studentMenu);

        // Set menu bar
        setJMenuBar(menuBar);

        // Add action listener to "Add Student" menu item
        addStudentItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (addStudentPanel == null) {
                    addStudentPanel = new Student(); // Create instance of Student class
                    add(addStudentPanel); // Add instance to AppGUI1 JFrame
                }
                addStudentPanel.showAddStudentForm(); // Show the form
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900, 700);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        AppGUI1 a = new AppGUI1();
    }
}

class Student extends JPanel{
    // for insert j panel
    private JLabel idLabel, nameLabel, majorLabel, phoneLabel, gpaLabel, dobLabel;
    private JTextField idField, nameField, majorField, phoneField, gpaField, dobField;
    private JButton submitButton;

    public void showAddStudentForm() {
        setLayout(new GridLayout(6, 2,10,10));
        
        idLabel = new JLabel("Student ID:");
        idField = new JTextField();
        nameLabel = new JLabel("Name:");
        nameField = new JTextField();
        majorLabel = new JLabel("Major:");
        majorField = new JTextField();
        phoneLabel = new JLabel("Phone:");
        phoneField = new JTextField();
        gpaLabel = new JLabel("GPA:");
        gpaField = new JTextField();
        dobLabel = new JLabel("Date of Birth (yyyy-mm-dd):");
        dobField = new JTextField();
        submitButton = new JButton("Submit");

        add(idLabel);
        add(idField);
        add(nameLabel);
        add(nameField);
        add(majorLabel);
        add(majorField);
        add(phoneLabel);
        add(phoneField);
        add(gpaLabel);
        add(gpaField);
        add(dobLabel);
        add(dobField);
        add(new JLabel());
        add(submitButton);

        // frame.add(panel);
        // frame.pack();
        // frame.setVisible(true);
    }
}
