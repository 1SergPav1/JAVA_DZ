package OOP.Seminar_5.model;

public class Teacher extends User {

    Integer teacherId;

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public Teacher(String firstName, String secondName, String lastName, Integer teacherId) {
        super(firstName, secondName, lastName);
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId=" + teacherId +
                '}';
    }
}
