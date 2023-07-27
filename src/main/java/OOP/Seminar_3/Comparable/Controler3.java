package OOP.Seminar_3.Comparable;

import java.util.List;

public class Controler3 {
    private final StudentGroupService3 studentGroupService = new StudentGroupService3();
    private final StreamService streamService = new StreamService();

    public void removeStudentByFIO(String lastName, String secondName, String firstName){
        studentGroupService.removeStudentByFIO(lastName,secondName,firstName);
    }

    public List<Student3> getSortedStudentList(){
        studentGroupService.getSortedStudentList();
        return null;
    }

    public List<StudentGroup3> getSortedStudentGroup3List() {
        streamService.getSortedStudentGroup3List();
        return null;
    }


}