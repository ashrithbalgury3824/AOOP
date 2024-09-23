package proj;

import java.util.Comparator;

public class CourseRegistrationSystem {
    private java.util.List<Student> students;

    public CourseRegistrationSystem() {
        students = new java.util.ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void displayCoursesForStudent(Student student) {
        student.getRegisteredCourses().sort(Comparator.comparing(Course::getCourseName));
        student.getRegisteredCourses().forEach(course -> System.out.println(course.getCourseName()));
    }
}
