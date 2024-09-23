package proj;

import java.util.Iterator;

public class CourseIterator implements Iterator<Course> {
    private java.util.List<Course> courses;
    private int index;

    public CourseIterator(java.util.List<Course> courses) {
        this.courses = courses;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < courses.size();
    }

    @Override
    public Course next() {
        return courses.get(index++);
    }
}
