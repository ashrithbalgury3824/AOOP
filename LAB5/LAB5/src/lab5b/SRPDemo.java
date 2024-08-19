package lab5b;

class Employee {
    private String name;
    private String role;

    public Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }
}

class SalaryCalculator {
    public double calculateSalary(Employee employee) {
        switch (employee.getRole()) {
            case "Manager":
                return 80000;
            case "Developer":
                return 60000;
            case "Tester":
                return 50000;
            default:
                return 40000;
        }
    }
}

public class SRPDemo {
    public static void main(String[] args) {
        Employee emp = new Employee("Alice", "Developer");
        SalaryCalculator calculator = new SalaryCalculator();
        System.out.println("Salary of " + emp.getName() + ": " + calculator.calculateSalary(emp));
    }
}
