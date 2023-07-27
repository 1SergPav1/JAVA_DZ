package OOP.Seminar_3.Comparable;

import java.util.Comparator;

public class StreamComparator implements Comparator<StudentGroup3> {


    @Override
    public int compare(StudentGroup3 o1, StudentGroup3 o2) {
        return Integer.compare(o1.getStudentsList().size(), o2.getStudentsList().size());
    }
}
