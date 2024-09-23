package proj;

public class Course implements Comparable<Course> {
    private String courseId;
    private String courseName;

    public Course(String courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }

    public String getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    @Override
    public int compareTo(Course other) {
        return this.courseName.compareTo(other.courseName);
    }
}
