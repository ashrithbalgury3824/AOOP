package lab6_ii;
import java.util.Scanner;

public class ToDoListApp {

    private ToDoList toDoList;
    private Scanner scanner;

    public ToDoListApp() {
        this.toDoList = new ToDoList();
        this.scanner = new Scanner(System.in);
    }

    public void run() {
        while (true) {
            System.out.println("1. Add task");
            System.out.println("2. Update task");
            System.out.println("3. Remove task");
            System.out.println("4. Display tasks");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // Consume newline 

            switch (option) {
                case 1:
                    addTask();
                    break;
                case 2:
                    updateTask();
                    break;
                case 3:
                    removeTask();
                    break;
                case 4:
                    displayTasks();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option. Please choose a valid option.");
            }
        }
    }

    private void addTask() {
        System.out.print("Enter task description: ");
        String taskDescription = scanner.nextLine();
        Task task = new Task(taskDescription);
        toDoList.addTask(task);
        System.out.println("Task added successfully!");
    }

    private void updateTask() {
        System.out.print("Enter task index (Starts From 0,1,2..): ");
        int index = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter new task description: ");
        String newTaskDescription = scanner.nextLine();
        Task newTask = new Task(newTaskDescription);
        toDoList.updateTask(index, newTask);
        System.out.println("Task updated successfully!");
    }

    private void removeTask() {
        System.out.print("Enter task index (Starts From 0,1,2..): ");
        int index = scanner.nextInt();
        scanner.nextLine(); // Consume newline 
        toDoList.removeTask(index);
        System.out.println("Task removed successfully!");
    }

    private void displayTasks() {
        toDoList.displayTasks();
    }

    public static void main(String[] args) {
        ToDoListApp app = new ToDoListApp();
        app.run();
    }
}