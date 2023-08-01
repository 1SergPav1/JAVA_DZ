package OOP.Seminar_4.service;

import OOP.Seminar_4.data.Teacher;
import OOP.Seminar_4.data.TeacherGroup;
import OOP.Seminar_4.data.User;
import OOP.Seminar_4.data.UserComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TeacherGroupService {

    private TeacherGroup teacherGroup;

    public void createTeacherGroup(List<Teacher> teachers) {
        this.teacherGroup = new TeacherGroup(teachers);
    }

    public TeacherGroup getTeacherGroup() {
        return teacherGroup;
    }

    public Teacher getTeacherFromTeacherGroup(String firstName, String secondName){
        Iterator<Teacher> iterator = teacherGroup.iterator();
        List<Teacher> result = new ArrayList<>();
        while (iterator.hasNext()){
            Teacher teacher = iterator.next();
            if (teacher.getFirstName().equalsIgnoreCase(firstName)
                    && teacher.getSecondName().equalsIgnoreCase(secondName)){
                result.add(teacher);
            }
        }
        if (result.size() == 0) {
            throw new IllegalStateException(
                    String.format("Преподаватель с именем %s и фамилией %s не найден", firstName, secondName));
        }
        if (result.size() != 1) {
            throw new IllegalStateException("Найдено больше одного перподавателя с указанными именем и фамилией");
        }
        return result.get(0);
    }

    public List<Teacher> getSortedTeachersGroup() {
        List<Teacher> teachers = new ArrayList<>(teacherGroup.getTeachers());
        Collections.sort(teachers);
        return teachers;
    }

    public List<Teacher> getSortedByFIOTeacherGroup(){
        List<Teacher> teachers = new ArrayList<>(teacherGroup.getTeachers());
        teachers.sort(new UserComparator<>());
        return teachers;
    }

    public void createTeacher(User user) {
        teacherGroup.createTeacher(user);
    }

}



