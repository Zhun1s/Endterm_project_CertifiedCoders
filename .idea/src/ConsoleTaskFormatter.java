public class ConsoleTaskFormatter implements TaskFormatter {
    @Override
    public String format(Task task) {
        return "Task: " + task.getDescription() + " (Priority: " + task.getPriority() + ")";
    }
}
