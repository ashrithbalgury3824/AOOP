package lab6;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        EmployeeManagement employeeManagement = new EmployeeManagement();

        Employee employee1 = new Employee(1, "John Doe", 5000.0);
        Employee employee2 = new Employee(2, "Jane Doe", 6000.0);
        Employee employee3 = new Employee(3, "Alice Brown", 4000.0);

        employeeManagement.addEmployee(employee1);
        employeeManagement.addEmployee(employee2);
        employeeManagement.addEmployee(employee3);

        System.out.println("Employees before sorting:");
        employeeManagement.displayEmployees();

        employeeManagement.sortById();
        System.out.println("Employees sorted by ID:");
        employeeManagement.displayEmployees();

        EmployeeComparator comparator = new EmployeeComparator();
        employeeManagement.sortByName(comparator);
        System.out.println("Employees sorted by Name:");
        employeeManagement.displayEmployees();

        Employee clonedEmployee = (Employee) employee1.clone();
        System.out.println("Cloned Employee: " + clonedEmployee);
    }
}
