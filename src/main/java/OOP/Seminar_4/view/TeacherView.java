package OOP.Seminar_4.view;

import OOP.Seminar_4.data.Teacher;

import java.util.List;

public class TeacherView implements UserViewInterface<Teacher> {

    @Override
    public void sendOnConsole(List<Teacher> listT) {
        System.out.println("Список учителей");
        for (Teacher teacher : listT) {
            System.out.println(teacher.getTeacherId());
        }
    }
}
