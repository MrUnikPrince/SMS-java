import javax.swing.*;
public class Manager {
    private JMenuBar menuBar;
    private JMenu studentMenu;
    private JMenuItem addStudentItem, deleteStudentItem;

    public StudentManagementSystem() {
        setTitle("Student Management System");

        menuBar = new JMenuBar();
        studentMenu = new JMenu("Student");
        addStudentItem = new JMenuItem("Add Student");
        deleteStudentItem = new JMenuItem("Delete Student");

        studentMenu.add(addStudentItem);
        studentMenu.add(deleteStudentItem);
        menuBar.add(studentMenu);
        setJMenuBar(menuBar);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        
    }
}
