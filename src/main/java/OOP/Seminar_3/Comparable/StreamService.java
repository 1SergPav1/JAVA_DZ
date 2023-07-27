package OOP.Seminar_3.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StreamService {

    private Stream stream;

    public List<StudentGroup3> getSortedStudentGroup3List() {
        List<StudentGroup3> studentGroup3List = new ArrayList<>(stream.getStudentGroup3List());
        studentGroup3List.sort(new StreamComparator());
        return studentGroup3List;
    }

}
