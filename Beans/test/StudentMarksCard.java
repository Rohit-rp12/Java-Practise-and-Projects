import java.io.Serializable;

public class StudentMarksCard implements Serializable {
    private String studentName;
    private String studentID;
    private String course;
    private int marksMath;
    private int marksScience;
    private int marksEnglish;

    public StudentMarksCard() {
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
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

    public int getTotalMarks() {
        return marksMath + marksScience + marksEnglish;
    }

    public double getAverageMarks() {
        return (marksMath + marksScience + marksEnglish) / 3.0;
    }
}
