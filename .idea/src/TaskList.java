import java.util.ArrayList;
import java.util.List;

public class TaskList {
    private List<Task> tasks = new ArrayList<>();
    private SortStrategy sortStrategy;

    public void setSortStrategy(SortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void sortTasks() {
        if (sortStrategy != null) {
            sortStrategy.sort(tasks);
        }
    }
}
