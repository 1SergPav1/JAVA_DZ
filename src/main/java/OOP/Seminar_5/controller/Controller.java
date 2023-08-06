package OOP.Seminar_5.controller;

import OOP.Seminar_5.model.*;
import OOP.Seminar_5.service.DataService;
import OOP.Seminar_5.view.StudentView;
import OOP.Seminar_5.view.TeacherView;
import OOP.Seminar_5.service.StudyGroupService;


import java.util.List;

public class Controller {

    DataService dataService = new DataService();

    private final StudentView studentView = new StudentView();
    private final TeacherView teacherView = new TeacherView();

    public void createStudent(String firstName, String secondName, String lastName) {
        dataService.create(firstName, secondName, lastName, Type.STUDENT);
    }

    public void createTeacher(String firstName, String secondName, String lastName) {
        dataService.create(firstName, secondName, lastName, Type.TEACHER);
    }

    public void getAllStudents() {
        List<User> userList = dataService.getAllStudents();
        for (User user : userList) {
            Student student = (Student) user;
            studentView.printOnConsole(student);
        }
    }


    public void getAllTeacher() {
        List<User> userList = dataService.getAllTeachers();
        for (User user : userList) {
            Teacher teacher = (Teacher) user;
            teacherView.printOnConsole(teacher);
        }
    }

    public void getStudyGroup(List<Student> students, Teacher teacher) {

    }



}
