package OOP.Seminar_3.Comparable;

import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudentGroup3> {

    private List<StudentGroup3> studentGroup3List;

    public List<StudentGroup3> getStudentGroup3List() {
        return studentGroup3List;
    }

    public void setStudentGroup3List(List<StudentGroup3> studentGroup3List) {
        this.studentGroup3List = studentGroup3List;
    }

    @Override
    public Iterator<StudentGroup3> iterator() {
        return new StreamIterator(this);
    }

}
