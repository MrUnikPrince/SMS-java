import javax.swing.*;

import java.awt.GridLayout;
import java.awt.*;
import java.awt.event.*;
class AddStudentForm extends JDialog {

    private JTextField idField;
    private JTextField nameField;
    private JTextField majorField;
    private JTextField phoneField;
    private JTextField cgpField;
    private JTextField dobField;
    private JButton submitButton;
    private JPanel panel;

    public AddStudentForm(JFrame parent) {
        // super(parent, "Add Student Form", true);

        panel = new JPanel(new GridLayout(6, 2));

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


        // submitButton.addActionListener(new ActionListener() {
        //     public void actionPerformed(ActionEvent e) {
        //         String id = idField.getText();
        //         String name = nameField.getText();
        //         String major = majorField.getText();
        //         String phone = phoneField.getText();
        //         String cgp = cgpField.getText();
        //         String dob = dobField.getText();

        //         // TODO: Validate input

        //         // TODO: Add student to database

        //         dispose();
        //     }
        // });

        add(panel);
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        pack();
        setLocationRelativeTo(parent);

    }
    public static void main(String[] args) {
        AddStudentForm a = new AddStudentForm(null);
    }
}