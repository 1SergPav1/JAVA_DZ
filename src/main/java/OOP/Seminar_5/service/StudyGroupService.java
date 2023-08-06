package OOP.Seminar_5.service;


import OOP.Seminar_5.model.Student;
import OOP.Seminar_5.model.StudyGroup;
import OOP.Seminar_5.model.Teacher;

import java.util.List;

public class StudyGroupService {

    private StudyGroup studyGroup;

    public void createStudyGroup(List<Student> students, Teacher teacher) {
        this.studyGroup = new StudyGroup(teacher, students);
    }

    public StudyGroup getStudyGroup() {
        return studyGroup;
    }
}
