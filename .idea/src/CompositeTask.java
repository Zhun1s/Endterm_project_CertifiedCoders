import java.util.ArrayList;
import java.util.List;

public class CompositeTask implements TaskComponent {
    private List<TaskComponent> tasks = new ArrayList<>();

    public void add(TaskComponent task) {
        tasks.add(task);
    }

    @Override
    public void display() {
        for (TaskComponent task : tasks) {
            task.display();
        }
    }
}
