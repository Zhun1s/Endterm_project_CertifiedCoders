public class CompletionHandler extends TaskHandler {
    @Override
    public void handle(Task task) {
        if (task.getPriority() < 3) {
            System.out.println("Handling completion of low priority task: " + task.getDescription());
        } else if (next != null) {
            next.handle(task);
        }
    }
}
