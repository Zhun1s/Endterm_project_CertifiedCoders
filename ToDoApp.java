import java.util.Scanner;

public class ToDoApp {
    private static TaskManager taskManager = TaskManager.getInstance();
    private static TaskNotifier notifier = new TaskNotifier();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to the To-Do List App!");
        
        notifier.addObserver(new TaskObserver("Observer1"));
        
        boolean exit = false;
        while (!exit) {
            displayMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            switch (choice) {
                case 1 -> addTask();
                case 2 -> displayTasks();
                case 3 -> exit = true;
                default -> System.out.println("Invalid option. Please try again.");
            }
        }
        System.out.println("Thank you for using the To-Do List App!");
    }

    private static void displayMenu() {
        System.out.println("\n1. Add Task");
        System.out.println("2. Display Tasks");
        System.out.println("3. Exit");
        System.out.print("Choose an option: ");
    }

    private static void addTask() {
        System.out.print("Enter task description: ");
        String description = scanner.nextLine();
        System.out.print("Enter task priority: ");
        int priority = scanner.nextInt();

        Task task = new Task.Builder(description).priority(priority).build();
        Command command = new AddTaskCommand(taskManager, task);
        command.execute();
        notifier.notifyObservers("New task added: " + task.getDescription());
    }

    private static void displayTasks() {
        Command command = new DisplayTasksCommand(taskManager);
        command.execute();
    }
}
