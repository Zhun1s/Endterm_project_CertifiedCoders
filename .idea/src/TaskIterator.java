import java.util.Iterator;
import java.util.List;

public class TaskIterator implements Iterator<Task> {
    private List<Task> tasks;
    private int position;

    public TaskIterator(List<Task> tasks) {
        this.tasks = tasks;
    }

    @Override
    public boolean hasNext() {
        return position < tasks.size();
    }

    @Override
    public Task next() {
        return tasks.get(position++);
    }
}
