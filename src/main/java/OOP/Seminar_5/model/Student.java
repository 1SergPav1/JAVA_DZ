package OOP.Seminar_5.model;

public class Student extends User {

    private Integer studentId;

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Student(String firstName, String secondName, String lastName, Integer studentId) {
        super(firstName, secondName, lastName);
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                '}';
    }
}
