package OOP.Seminar_4.view;

import OOP.Seminar_4.data.Student;

import java.util.List;

public class StudentView implements UserViewInterface<Student>{

    @Override
    public void sendOnConsole(List<Student> listT) {
        System.out.println("Список студентов");
        for(Student student: listT) {
            System.out.println(student.getStudentId());
        }
    }
}
