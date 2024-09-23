package proj;

public class Student implements Cloneable {
    private String studentName;
    private java.util.List<Course> registeredCourses;

    public Student(String studentId, String studentName) {
        this.studentName = studentName;
        this.registeredCourses = new java.util.ArrayList<>();
    }

    public void registerCourse(Course course) {
        registeredCourses.add(course);
    }

    public java.util.List<Course> getRegisteredCourses() {
        return registeredCourses;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Student cloned = (Student) super.clone();
        cloned.registeredCourses = new java.util.ArrayList<>(registeredCourses);
        return cloned;
    }

    public String getStudentName() {
        return studentName;
    }
}
