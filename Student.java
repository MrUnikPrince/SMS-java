import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Student extends JPanel {
    private JLabel idLabel, nameLabel, majorLabel, phoneLabel, gpaLabel, dobLabel;
    private JTextField idField, nameField, majorField, phoneField, gpaField, dobField;
    private JButton submitButton;

    public void showAddStudentForm(){

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

    }
    public static void main(String[] args) {
        Student s = new Student();
        s.showAddStudentForm();
    }
}
