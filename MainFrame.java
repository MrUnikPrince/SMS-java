import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainFrame extends JFrame {
    private JMenuItem addStudentMenuItem;

    public MainFrame() {
        // Initialize components
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        addStudentMenuItem = new JMenuItem("Add Student");

        // Add components to menu bar
        menuBar.add(fileMenu);

        // Add menu items to file menu
        fileMenu.add(addStudentMenuItem);

        // Set menu bar for frame
        setJMenuBar(menuBar);

        // Add action listeners
        addStudentMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Show add student form in pop-up window
                AddStudentForm addStudentForm = new AddStudentForm(MainFrame.this);
                addStudentForm.setVisible(true);
            }
        });

        // Set frame properties
        setTitle("Student Management System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        MainFrame m = new MainFrame();
    }
}
// public class AddStudentForm extends JDialog {
//     private JLabel idLabel;
//     private JLabel nameLabel;
//     private JLabel majorLabel;
//     private JLabel phoneLabel;
//     private JLabel cgpLabel;
//     private JLabel dobLabel;
//     private JTextField idField;
//     private JTextField nameField;
//     private JTextField majorField;
//     private JTextField phoneField;
//     private JTextField cgpField;
//     private JTextField dobField;
//     private JButton submitButton;

//     public AddStudentForm(Frame parent) {
//         super(parent, "Add Student", true);
//         setLayout(new GridBagLayout());
//         GridBagConstraints gbc = new GridBagConstraints();
//         gbc.gridx = 0;
//         gbc.gridy = 0;
//         gbc.insets = new Insets(5, 5, 5, 5);

//         idLabel = new JLabel("Student ID:");
//         gbc.anchor = GridBagConstraints.EAST;
//         add(idLabel, gbc);

//         idField = new JTextField(20);
//         gbc.gridx++;
//         gbc.anchor = GridBagConstraints.WEST;
//         add(idField, gbc);

//         nameLabel = new JLabel("Name:");
//         gbc.gridx = 0;
//         gbc.gridy++;
//         gbc.anchor = GridBagConstraints.EAST;
//         add(nameLabel, gbc);

//         nameField = new JTextField(20);
//         gbc.gridx++;
//         gbc.anchor = GridBagConstraints.WEST;
//         add(nameField, gbc);

//         majorLabel = new JLabel("Major:");
//         gbc.gridx = 0;
//         gbc.gridy++;
//         gbc.anchor = GridBagConstraints.EAST;
//         add(majorLabel, gbc);

//         majorField = new JTextField(20);
//         gbc.gridx++;
//         gbc.anchor = GridBagConstraints.WEST;
//         add(majorField, gbc);

//         phoneLabel = new JLabel("Phone:");
//         gbc.gridx = 0;
//         gbc.gridy++;
//         gbc.anchor = GridBagConstraints.EAST;
//         add(phoneLabel, gbc);

//         phoneField = new JTextField(20);
//         gbc.gridx++;
//         gbc.anchor = GridBagConstraints.WEST;
//         add(phoneField, gbc);

//         cgpLabel = new JLabel("CGP:");
//         gbc.gridx = 0;
//         gbc.gridy++;
//         gbc.anchor = GridBagConstraints.EAST;
//         add(cgpLabel, gbc);

//         cgpField = new JTextField(20);
//         gbc.gridx++;
//         gbc.anchor = GridBagConstraints.WEST;
//         add(cgpField, gbc);

//         dobLabel = new JLabel("Date of Birth (YYYY-MM-DD):");
//         gbc.gridx = 0;
//         gbc.gridy++;
//         gbc.anchor = GridBagConstraints.EAST;
//         add(dobLabel, gbc);

//         dobField = new JTextField(20);
//         gbc.gridx++;
//         gbc.anchor = GridBagConstraints.WEST;
//         add(dobField, gbc);

//         submitButton = new JButton("Submit");
//         gbc.gridx = 0;
//         gbc.gridy++;
//         gbc.gridwidth = 2;
//         gbc.anchor = GridBagConstraints.CENTER;
//         add(submitButton, gbc);

//         // Add action listener for submit button
//         submitButton.addActionListener(new ActionListener() {
//             public void actionPerformed(ActionEvent e) {
//                 // Get values from fields
//                 String id = idField.getText();
//                 String name = nameField.getText();
//                 String major = majorField.getText();
//                 String phone = phoneField.getText();
//                 String cgp = cgpField.getText();
//                 String dob = dobField.getText();

//                 // TODO: Validate input

//                 // TODO: Add student to database

//                 // Close the form
//                 dispose();
//             }
//         });

//         // Set form properties
//         setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
//         pack();
//         setLocationRelativeTo(parent);
//     }
// }
// import javax.swing.*;
// import java.awt.*;
// import java.awt.event.*;

public class AddStudentForm extends JDialog {

    private JTextField idField;
    private JTextField nameField;
    private JTextField majorField;
    private JTextField phoneField;
    private JTextField cgpField;
    private JTextField dobField;
    private JButton submitButton;

    public AddStudentForm(JFrame parent) {
        super(parent, "Add Student Form", true);

        JPanel panel = new JPanel(new GridLayout(6, 2));

        panel.add(new JLabel("Student ID:"));
        idField = new JTextField(20);
        panel.add(idField);

        panel.add(new JLabel("Name:"));
        nameField = new JTextField(20);
        panel.add(nameField);

        panel.add(new JLabel("Major:"));
        majorField = new JTextField(20);
        panel.add(majorField);

        panel.add(new JLabel("Phone:"));
        phoneField = new JTextField(20);
        panel.add(phoneField);

        panel.add(new JLabel("CGP:"));
        cgpField = new JTextField(20);
        panel.add(cgpField);

        panel.add(new JLabel("Date of Birth (yyyy-mm-dd):"));
        dobField = new JTextField(20);
        panel.add(dobField);

        submitButton = new JButton("Submit");
        panel.add(submitButton);

        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String id = idField.getText();
                String name = nameField.getText();
                String major = majorField.getText();
                String phone = phoneField.getText();
                String cgp = cgpField.getText();
                String dob = dobField.getText();

                // TODO: Validate input

                // TODO: Add student to database

                dispose();
            }
        });

        add(panel);
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        pack();
        setLocationRelativeTo(parent);
    }
}



