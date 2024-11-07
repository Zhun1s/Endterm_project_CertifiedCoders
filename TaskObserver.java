public class TaskObserver {
    private String name;

    public TaskObserver(String name) {
        this.name = name;
    }

    public void update(String message) {
        System.out.println(name + " received update: " + message);
    }
}
