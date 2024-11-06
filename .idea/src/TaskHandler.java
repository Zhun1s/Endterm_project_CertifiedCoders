public abstract class TaskHandler {
    protected TaskHandler next;

    public void setNext(TaskHandler next) {
        this.next = next;
    }

    public abstract void handle(Task task);
}
