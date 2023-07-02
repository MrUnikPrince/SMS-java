import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class AppGUI extends JFrame implements ActionListener{
    private JMenuBar menuBar;
    private JMenu studentMenu;
    private JMenuItem addStudentItem, deleteStudentItem, displayStudent, searchStudent, updateStudent;


    public AppGUI() {
        setTitle("Student Management System");
// menu bar 
        menuBar = new JMenuBar();

        studentMenu = new JMenu("Student");
// menu item list

        addStudentItem = new JMenuItem("Add Student");
        deleteStudentItem = new JMenuItem("Delete Student");
        updateStudent = new JMenuItem("Update Student");
        searchStudent = new JMenuItem("Search Student");
        displayStudent = new JMenuItem("Display Student");

// adding menu item in menu list 

        studentMenu.add(addStudentItem);
        studentMenu.add(deleteStudentItem);
        studentMenu.add(updateStudent);
        studentMenu.add(searchStudent);
        studentMenu.add(displayStudent);
        menuBar.add(studentMenu);
        setJMenuBar(menuBar);

        addStudentItem.addActionListener(this);



    @Override
    public void actionPerformed(ActionEvent e) {
        Student s = new Student();
        s.showAddStudentForm();
        
    }
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // pack();
        setSize(600, 400); // Set initial size
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        AppGUI a = new AppGUI();
    }
}