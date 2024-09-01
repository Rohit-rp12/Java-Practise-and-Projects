import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CourseRegistrationForm extends JFrame implements ActionListener {

    private JTextField nameField, emailField, courseField;
    private JPasswordField passwordField;
    private JTextArea addressArea;
    private JButton submitButton;

    public CourseRegistrationForm() {
        // Setting up the frame
        setTitle("Student Course Registration Form");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(6, 2, 10, 10));

        // Name Label and TextField
        JLabel nameLabel = new JLabel("Name:");
        nameField = new JTextField();
        add(nameLabel);
        add(nameField);

        // Email Label and TextField
        JLabel emailLabel = new JLabel("Email:");
        emailField = new JTextField();
        add(emailLabel);
        add(emailField);

        // Password Label and PasswordField
        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField();
        add(passwordLabel);
        add(passwordField);

        // Course Label and TextField
        JLabel courseLabel = new JLabel("Course:");
        courseField = new JTextField();
        add(courseLabel);
        add(courseField);

        // Address Label and TextArea with ScrollPane
        JLabel addressLabel = new JLabel("Address:");
        addressArea = new JTextArea(5, 20);
        JScrollPane scrollPane = new JScrollPane(addressArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        add(addressLabel);
        add(scrollPane);

        // Submit Button
        submitButton = new JButton("Submit");
        submitButton.addActionListener(this);
        add(new JLabel()); // Empty cell for layout adjustment
        add(submitButton);

        // Setting the frame visibility to true
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            String name = nameField.getText();
            String email = emailField.getText();
            String password = new String(passwordField.getPassword());
            String course = courseField.getText();
            String address = addressArea.getText();

            // Display the registration information (you can save it to a database or file as needed)
            JOptionPane.showMessageDialog(this, 
                    "Name: " + name + "\nEmail: " + email + "\nPassword: " + password + 
                    "\nCourse: " + course + "\nAddress: " + address,
                    "Registration Info",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new CourseRegistrationForm();
    }
}
