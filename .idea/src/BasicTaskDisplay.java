public class BasicTaskDisplay implements TaskDisplay {
    public Task task;

    public BasicTaskDisplay(Task task) {
        this.task = task;
    }

    public void display() {
        System.out.println("Task: " + task.getDescription() + ", Priority: " + task.getPriority());
    }
}
