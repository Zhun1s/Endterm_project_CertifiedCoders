import java.util.ArrayList;
import java.util.List;

public class TaskNotifier {
    private List<TaskObserver> observers = new ArrayList<>();

    public void addObserver(TaskObserver observer) {
        observers.add(observer);
    }

    public void notifyObservers(String message) {
        for (TaskObserver observer : observers) {
            observer.update(message);
        }
    }
}
