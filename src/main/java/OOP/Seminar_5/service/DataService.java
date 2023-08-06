package OOP.Seminar_5.service;

import OOP.Seminar_5.model.Student;
import OOP.Seminar_5.model.Teacher;
import OOP.Seminar_5.model.Type;
import OOP.Seminar_5.model.User;

import java.util.ArrayList;
import java.util.List;

public class DataService {

    private List<User> userList;


    public void create(String firstName, String secondName, String lastName, Type type) {
        int id = getFreeId(type);
        if (Type.STUDENT == type) {
            Student student = new Student(firstName, secondName, lastName, id);
            userList.add(student);
        }
        if (Type.TEACHER == type) {
            Teacher teacher = new Teacher(firstName, secondName, lastName, id);
            userList.add(teacher);
        }
    }

    private int getFreeId(Type type) {
        int lastId = 1;
        boolean itsStudent = Type.STUDENT == type;
        for (User user : userList) {
            if(itsStudent && user instanceof Student){
                lastId = ((Student) user).getStudentId() + 1;
            }
            if(!itsStudent && user instanceof Teacher) {
                lastId = ((Teacher) user).getTeacherId() + 1;
            }
        }
        return lastId;
    }

    public DataService() {
        this.userList = new ArrayList<>();
    }

    public List<User> getUserList() {
        return userList;
    }

    public List<User> getAllStudents() {
        List<User> students = new ArrayList<>();
        for (User user: userList) {
            if(user instanceof Student) {
                students.add(user);
            }
        }
        return students;
    }

    public List<User> getAllTeachers() {
        List<User> teachers = new ArrayList<>();
        for (User user: userList) {
            if(user instanceof Teacher) {
                teachers.add(user);
            }
        }
        return teachers;
    }


    @Override
    public String toString() {
        return "DataService{" +
                "userList=" + userList +
                '}';
    }
}