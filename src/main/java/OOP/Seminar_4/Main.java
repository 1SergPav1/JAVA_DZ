package OOP.Seminar_4;

import OOP.Seminar_4.data.Teacher;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Teacher teacher1 = new Teacher("А", "B", 11L);
        Teacher teacher2 = new Teacher("C", "V", 12L);
        Teacher teacher3 = new Teacher("E", "D", 13L);

        List<Teacher>  teacherList= new ArrayList<>();
        teacherList.add(teacher1);
        teacherList.add(teacher2);
        teacherList.add(teacher3);
        System.out.println(teacherList);

    }

}
