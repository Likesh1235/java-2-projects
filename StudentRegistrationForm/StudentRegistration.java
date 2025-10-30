import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class StudentRegistration extends JFrame implements ActionListener {
    private JTextField nameField, rollField, deptField, emailField;
    private JButton submitBtn, resetBtn;

    public StudentRegistration() {
        setTitle("Student Registration Form");
        setSize(400, 350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(6, 2, 10, 10));

        add(new JLabel("Name:"));
        nameField = new JTextField();
        add(nameField);

        add(new JLabel("Roll No:"));
        rollField = new JTextField();
        add(rollField);

        add(new JLabel("Department:"));
        deptField = new JTextField();
        add(deptField);

        add(new JLabel("Email:"));
        emailField = new JTextField();
        add(emailField);

        submitBtn = new JButton("Submit");
        resetBtn = new JButton("Reset");
        add(submitBtn);
        add(resetBtn);

        submitBtn.addActionListener(this);
        resetBtn.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitBtn) {
            String name = nameField.getText();
            String roll = rollField.getText();
            String dept = deptField.getText();
            String email = emailField.getText();

            if (name.isEmpty() || roll.isEmpty() || dept.isEmpty() || email.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please fill all fields!");
                return;
            }

            try (FileWriter fw = new FileWriter("students.txt", true)) {
                fw.write(name + "," + roll + "," + dept + "," + email + "\n");
                JOptionPane.showMessageDialog(this, "Registration Successful!");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Error saving data!");
            }
        } else if (e.getSource() == resetBtn) {
            nameField.setText("");
            rollField.setText("");
            deptField.setText("");
            emailField.setText("");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new StudentRegistration().setVisible(true));
    }
}

