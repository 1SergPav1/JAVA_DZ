package OOP.Seminar_3.Comparable;

import java.util.Iterator;
import java.util.List;

public class StreamIterator implements Iterator<StudentGroup3> {

    private int counter;

    private final List<StudentGroup3> studentGroup3List;

    public StreamIterator(Stream stream) {
        this.studentGroup3List = stream.getStudentGroup3List();
        this.counter = 0;
    }


    @Override
    public boolean hasNext() {
        return counter < studentGroup3List.size() - 1;
    }

    @Override
    public StudentGroup3 next() {
        if (!hasNext()) {
            return null;
        }
        counter++;
        return studentGroup3List.get(counter);
    }

    @Override
    public void remove() {
        studentGroup3List.remove(counter);
    }
}
