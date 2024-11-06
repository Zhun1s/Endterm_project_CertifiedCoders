public class Task {
    private final String description;
    private final int priority;

    public static class Builder {
        private String description;
        private int priority;

        public Builder(String description) {
            this.description = description;
        }

        public Builder priority(int priority) {
            this.priority = priority;
            return this;
        }

        public Task build() {
            return new Task(this);
        }
    }

    private Task(Builder builder) {
        this.description = builder.description;
        this.priority = builder.priority;
    }

    public String getDescription() {
        return description;
    }

    public int getPriority() {
        return priority;
    }
}
