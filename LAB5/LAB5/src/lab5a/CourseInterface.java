package lab5a;

import java.util.List;

public interface CourseInterface {
    String getCourseId();
    String getCourseName();
    List<Student> getEnrolledStudents();
    void addStudent(Student student);
}
