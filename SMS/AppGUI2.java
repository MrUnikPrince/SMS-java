package SMS;
import java.awt.CardLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;

import javax.swing.*;

public class AppGUI2 extends JFrame {
    private JMenuBar menuBar;
    private JMenu studentMenu;
    private JMenuItem addStudentItem, deleteStudentItem, displayStudent, searchStudent, updateStudent;
    private JPanel cards;
    private Student addStudentPanel;

    public AppGUI2() {
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

        // Create the card layout
        cards = new JPanel(new CardLayout());
        add(cards);

        // Add the "Add Student" panel to the card layout
        addStudentPanel = new Student();
        cards.add(addStudentPanel, "addStudent");

        // Add action listener to "Add Student" menu item
        addStudentItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) cards.getLayout();
                cl.show(cards, "addStudent");
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900, 700);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        AppGUI2 a = new AppGUI2();
    }
}

class Student extends JPanel implements ActionListener{
    // for insert j panel
    private JLabel idLabel, nameLabel, majorLabel, phoneLabel, gpaLabel, dobLabel;
    private JTextField idField, nameField, majorField, phoneField, gpaField, dobField;
    private JButton submitButton;

    public Student() {
        setLayout(new GridLayout(9, 4));

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

        submitButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        dbConnect db = new dbConnect();
        Connection conn;
        try{
            conn = db.getConnection();
        }catch(SQLException | ClassNotFoundException ex){
            throw new RuntimeException(ex);
        }
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}
