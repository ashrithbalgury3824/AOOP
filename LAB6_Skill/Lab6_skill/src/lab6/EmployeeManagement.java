package lab6;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeManagement {
    private ArrayList<Employee> employees;

    public EmployeeManagement() {
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void sortById() {
        Collections.sort(employees);
    }

    public void sortByName(EmployeeComparator comparator) {
        Collections.sort(employees, comparator);
    }

    public void displayEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}

