import javax.swing.*;
import java.awt.*;

public class StudentMarksCardApp {
    public static void main(String[] args) {
        // Create a new student marks card bean
        StudentMarksCard student = new StudentMarksCard();
        student.setStudentName("John Doe");
        student.setStudentID("123456");
        student.setCourse("Computer Science");
        student.setMarksMath(85);
        student.setMarksScience(90);
        student.setMarksEnglish(88);

        // Create and set up the window
        JFrame frame = new JFrame("Student Marks Card");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Create labels to display the student's information and marks
        JLabel nameLabel = new JLabel("Name: " + student.getStudentName());
        JLabel idLabel = new JLabel("ID: " + student.getStudentID());
        JLabel courseLabel = new JLabel("Course: " + student.getCourse());
        JLabel mathLabel = new JLabel("Math: " + student.getMarksMath());
        JLabel scienceLabel = new JLabel("Science: " + student.getMarksScience());
        JLabel englishLabel = new JLabel("English: " + student.getMarksEnglish());
        JLabel totalLabel = new JLabel("Total Marks: " + student.getTotalMarks());
        JLabel averageLabel = new JLabel(String.format("Average Marks: %.2f", student.getAverageMarks()));

        // Set up the layout and add labels to the frame
        frame.setLayout(new GridLayout(8, 1));
        frame.add(nameLabel);
        frame.add(idLabel);
        frame.add(courseLabel);
        frame.add(mathLabel);
        frame.add(scienceLabel);
        frame.add(englishLabel);
        frame.add(totalLabel);
        frame.add(averageLabel);

        // Display the window
        frame.setVisible(true);
    }
}
