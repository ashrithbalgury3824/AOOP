package proj;

public class UnivRegMain {
    public static void main(String[] args) throws CloneNotSupportedException {
        Course course1 = new Course("C101", "Mathematics");
        Course course2 = new Course("C102", "Physics");
        Course course3 = new Course("C103", "Chemistry");

        Student student1 = new Student("S001", "Alice");
        student1.registerCourse(course1);
        student1.registerCourse(course2);

        Student student2 = new Student("S002", "Bob");
        student2.registerCourse(course2);
        student2.registerCourse(course3);

        CourseRegistrationSystem system = new CourseRegistrationSystem();
        system.addStudent(student1);
        system.addStudent(student2);

        system.displayCoursesForStudent(student1);
        
        Student clonedStudent = (Student) student1.clone();
        System.out.println(clonedStudent.getStudentName() + " (Cloned)");
    }
}
