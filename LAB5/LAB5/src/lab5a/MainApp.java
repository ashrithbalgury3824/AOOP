package lab5a;

public class MainApp {

    public static void main(String[] args) {
        Student student1 = new Student("Alice", "S001");
        Student student2 = new Student("Bob", "S002");

        Course course1 = new Course("C001", "Mathematics");
        Course course2 = new Course("C002", "Physics");

        EnrollmentService enrollmentService = new EnrollmentService();
        
        // Enrolling students in courses
        enrollmentService.enroll(student1, course1);
        enrollmentService.enroll(student2, course1);
        enrollmentService.enroll(student1, course2);

        // Displaying student courses
        System.out.println("Courses enrolled by " + student1.getName() + ":");
        for (Course course : student1.getEnrolledCourses()) {
            System.out.println(course.getCourseName());
        }

        System.out.println("Courses enrolled by " + student2.getName() + ":");
        for (Course course : student2.getEnrolledCourses()) {
            System.out.println(course.getCourseName());
        }
        
        // Displaying enrolled students in a course
        System.out.println("Students enrolled in " + course1.getCourseName() + ":");
        for (Student student : course1.getEnrolledStudents()) {
            System.out.println(student.getName());
        }

        System.out.println("Students enrolled in " + course2.getCourseName() + ":");
        for (Student student : course2.getEnrolledStudents()) {
            System.out.println(student.getName());
        }
    }
}
