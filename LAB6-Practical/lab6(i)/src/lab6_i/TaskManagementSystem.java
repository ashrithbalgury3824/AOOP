package lab6_i;

public class TaskManagementSystem {
    private java.util.ArrayList<Task> tasks;
    private java.util.Scanner scanner;

    public TaskManagementSystem() {
        this.tasks = new java.util.ArrayList<>();
        this.scanner = new java.util.Scanner(System.in);
    }

    public void addTask() {
        System.out.println("Enter task description:");
        String description = scanner.nextLine();
        Task task = new Task(description);
        tasks.add(task);
        System.out.println("Task added successfully!");
    }

    public void updateTask() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available to update!");
            return;
        }
        System.out.println("Enter task position to update (1-" + tasks.size() + "):");
        int position = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over
        if (position < 1 || position > tasks.size()) {
            System.out.println("Invalid position!");
            return;
        }
        System.out.println("Enter new task description:");
        String newDescription = scanner.nextLine();
        Task task = tasks.get(position - 1);
        task.setDescription(newDescription);
        System.out.println("Task updated successfully!");
    }

    public void removeTask() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available to remove!");
            return;
        }
        System.out.println("Enter task position to remove (1-" + tasks.size() + "):");
        int position = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over
        if (position < 1 || position > tasks.size()) {
            System.out.println("Invalid position!");
            return;
        }
        tasks.remove(position - 1);
        System.out.println("Task removed successfully!");
    }

    public void displayTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available!");
            return;
        }
        System.out.println("Tasks:");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i).getDescription());
        }
    }

    public void run() {
        while (true) {
            System.out.println("Task Management System");
            System.out.println("1. Add task");
            System.out.println("2. Update task");
            System.out.println("3. Remove task");
            System.out.println("4. Display tasks");
            System.out.println("5. Exit");
            System.out.println("Enter your choice:");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over
            switch (choice) {
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
                    System.out.println("Invalid choice!");
            }
        }
    }
}