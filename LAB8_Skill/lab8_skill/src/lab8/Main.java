package lab8;
import java.util.Arrays;
import java.util.Comparator;
import java.util.OptionalDouble;

public class Main {
    public static void main(String[] args) {
        String[][] employees = {
            {"John", "1000"},
            {"Alice", "2000"},
            {"Bob", "1500"},
            {"Charlie", "2500"},
            {"David", "3000"},
            {"Eve", "3500"},
            {"Frank", "4000"},
            {"George", "4500"},
            {"Hannah", "5000"},
            {"Ivan", "5500"}
        };

        var employeeStream = Arrays.stream(employees)
                .map(employee -> new Object[]{employee[0], Integer.parseInt(employee[1])});

        System.out.println("Employees with salary greater than 3000:");
        employeeStream.filter(employee -> (int) employee[1] > 3000)
                .forEach(employee -> System.out.println(employee[0] + ": " + employee[1]));

        employeeStream = Arrays.stream(employees)
                .map(employee -> new Object[]{employee[0], Integer.parseInt(employee[1])});

        System.out.println("\nEmployees sorted by salary in ascending order:");
        employeeStream.sorted(Comparator.comparingInt(e -> (int) e[1]))
                .forEach(employee -> System.out.println(employee[0] + ": " + employee[1]));

        employeeStream = Arrays.stream(employees)
                .map(employee -> new Object[]{employee[0], Integer.parseInt(employee[1])});

        System.out.println("\nEmployee with the highest salary:");
        var highestSalaryEmployee = employeeStream.max(Comparator.comparingInt(e -> (int) e[1]))
                .orElse(new Object[]{"", 0});
        System.out.println(highestSalaryEmployee[0] + ": " + highestSalaryEmployee[1]);

        employeeStream = Arrays.stream(employees)
                .map(employee -> new Object[]{employee[0], Integer.parseInt(employee[1])});

        System.out.println("\nAverage salary:");
        OptionalDouble averageSalary = employeeStream.mapToInt(employee -> (int) employee[1]).average();
        System.out.println(averageSalary.orElse(0));
    }
}
