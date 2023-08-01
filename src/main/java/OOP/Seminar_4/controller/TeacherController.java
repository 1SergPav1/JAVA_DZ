package OOP.Seminar_4.controller;

import OOP.Seminar_4.data.Teacher;
import OOP.Seminar_4.view.TeacherView;
import OOP.Seminar_4.view.UserViewInterface;

public class TeacherController implements IUserController {

    private UserViewInterface userView = new TeacherView();


    @Override
    public void create(String firstName, String secondName) {
        Teacher newTeacher = new Teacher(firstName, secondName);
    }
}
