import javax.management.RuntimeErrorException;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.SQLException;

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
                
                MainFrame m = new MainFrame();
                m.inserdata();
                m.setVisible(true);
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

    private static JTextField idField;
    private static JTextField nameField;
    private static JTextField majorField;
    private static JTextField phoneField;
    private static JTextField cgpField;
    private static JTextField dobField;
    private static JButton submitButton;
    private static JPanel panel;
    private Statement stmt;
    public void inserdata(){ 
        System.out.println("hiii i am Prince");
        panel = new JPanel(new GridLayout(7, 2, 0,7));

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

        dbConnect db = new dbConnect();
        Connection conn;
        try{
            conn = db.getConnection(); 
        } catch (SQLException | ClassNotFoundException ex) {
            throw new RuntimeException(ex);
        }
        try {
            stmt = conn.createStatement();

        } catch (SQLException e1) {
            e1.printStackTrace();
            // TODO: handle exception
        }
        Table tb = new Table();
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String id = idField.getText();
                String name = nameField.getText();
                String major = majorField.getText();
                String phone = phoneField.getText();
                String cgp = cgpField.getText();
                String dob = dobField.getText();
                // TODO: Add student to database
               String sql = "INSERT INTO `smsdata` ( `name`, `major`, `phone`, `GPA`, `dob`, `date`) VALUES ( 'name', 'major', 'phone', 'cgp',  current_timestamp());";
                
               try {
                stmt.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Student added successfully.");
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
                dispose();
            }
        });

        add(panel);
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        pack();
        // setLocationRelativeTo(parent);

    }
}
