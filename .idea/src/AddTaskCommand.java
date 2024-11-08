public class AddTaskCommand implements Command {
    private TaskManager taskManager;
    private Task task;

    public AddTaskCommand(TaskManager taskManager, Task task) {
        this.taskManager = taskManager;
        this.task = task;
    }

    @Override
    public void execute() {
        taskManager.addTask(task);
        System.out.println("Task added: " + task.getDescription());
    }
}
