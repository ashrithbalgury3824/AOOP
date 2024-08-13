package lab5a;

public class EnrollmentService implements EnrollmentInterface {

    @Override
    public void enroll(Student student, Course course) {
        student.enrollInCourse(course);
        course.addStudent(student);
    }
}
