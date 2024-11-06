import java.util.Comparator;
import java.util.List;

public class PrioritySortStrategy implements SortStrategy {
    @Override
    public void sort(List<Task> tasks) {
        tasks.sort(Comparator.comparingInt(Task::getPriority));
    }
}
