package OOP.Seminar_3.Comparable;


import java.util.*;

public class StudentGroupService3 {
    private StudentGroup3 studentGroup3;
    public void removeStudentByFIO(String lastName, String secondName, String firstName){
        Iterator<Student3> iterator = studentGroup3.iterator();
        while (iterator.hasNext()){
            Student3 student = iterator.next();
            if (student.getFirstName().equals(firstName) && student.getSecondName().equals(secondName)&&
                    student.getLastName().equals(lastName)){
                iterator.remove();
            }
        }
    }
    public List<Student3> getSortedStudentList(){
        List<Student3> studentList = new ArrayList<>(studentGroup3.getStudentsList());
        Collections.sort(studentList);
        return studentList;
    }
}