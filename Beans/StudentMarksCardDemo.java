import java.io.Serializable;

class StudentMarksCard implements Serializable {
    private String studentName;
    private int rollNumber;
    private int marksMath;
    private int marksScience;
    private int marksEnglish;

    // Default constructor
    public StudentMarksCard() {
    }

    // Parameterized constructor
    public StudentMarksCard(String studentName, int rollNumber, int marksMath, int marksScience, int marksEnglish) {
        this.studentName = studentName;
        this.rollNumber = rollNumber;
        this.marksMath = marksMath;
        this.marksScience = marksScience;
        this.marksEnglish = marksEnglish;
    }

    // Getter and Setter methods
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public int getMarksMath() {
        return marksMath;
    }

    public void setMarksMath(int marksMath) {
        this.marksMath = marksMath;
    }

    public int getMarksScience() {
        return marksScience;
    }

    public void setMarksScience(int marksScience) {
        this.marksScience = marksScience;
    }

    public int getMarksEnglish() {
        return marksEnglish;
    }

    public void setMarksEnglish(int marksEnglish) {
        this.marksEnglish = marksEnglish;
    }

    // Method to calculate total marks
    public int getTotalMarks() {
        return marksMath + marksScience + marksEnglish;
    }

    // Method to calculate average marks
    public double getAverageMarks() {
        return (marksMath + marksScience + marksEnglish) / 3.0;
    }

    @Override
    public String toString() {
        return "StudentMarksCard{" +
                "studentName='" + studentName + '\'' +
                ", rollNumber=" + rollNumber +
                ", marksMath=" + marksMath +
                ", marksScience=" + marksScience +
                ", marksEnglish=" + marksEnglish +
                ", totalMarks=" + getTotalMarks() +
                ", averageMarks=" + getAverageMarks() +
                '}';
    }
}

public class StudentMarksCardDemo {
    public static void main(String[] args) {
        // Creating a student marks card object
        StudentMarksCard student = new StudentMarksCard("John Doe", 101, 85, 90, 88);

        // Displaying the student marks card
        System.out.println(student);

        // Modifying the marks
        student.setMarksMath(95);
        student.setMarksScience(92);
        student.setMarksEnglish(89);

        // Displaying the updated student marks card
        System.out.println("Updated Marks Card:");
        System.out.println(student);
    }
}