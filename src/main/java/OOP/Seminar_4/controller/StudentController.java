package OOP.Seminar_4.controller;

import OOP.Seminar_4.data.Student;
import OOP.Seminar_4.view.StudentView;
import OOP.Seminar_4.view.UserViewInterface;

public class StudentController implements IUserController {

    private UserViewInterface userView = new StudentView();

    @Override
    public void create(String firstName, String secondName) {
        Student newStudent = new Student(firstName, secondName);
    }
}
