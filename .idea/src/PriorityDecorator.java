public class PriorityDecorator extends BasicTaskDisplay {
    public PriorityDecorator(Task task) {
        super(task);
    }

    @Override
    public void display() {
        super.display();
        System.out.println("This task has priority: " + task.getPriority());
    }
}
