public class DisplayTasksCommand implements Command {
    private TaskManager taskManager;

    public DisplayTasksCommand(TaskManager taskManager) {
        this.taskManager = taskManager;
    }

    @Override
    public void execute() {
        for (Task task : taskManager.getTasks()) {
            System.out.println("Task: " + task.getDescription() + ", Priority: " + task.getPriority());
        }
    }
}
