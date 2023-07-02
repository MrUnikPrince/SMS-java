import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AddStudentForm extends JPanel implements ActionListener {
    private JLabel idLabel, nameLabel, majorLabel, phoneLabel, gpaLabel, dobLabel;
    private JTextField idField, nameField, majorField, phoneField, gpaField, dobField;
    private JButton submitButton;

    public AddStudentForm() {
        setLayout(new GridLayout(7, 2));
        
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

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            String studentID = idField.getText();
            String name = nameField.getText();
            String major = majorField.getText();
            String phone = phoneField.getText();
            String gpa = gpaField.getText();
            String dob = dobField.getText();

            // TODO: Add code to save student information to database or file

            JOptionPane.showMessageDialog(this, "Student information saved successfully!");
        }
    }
    public static void main(String[] args) {
        AddStudentForm a = new AddStudentForm();
    }
}
