public class LegacyTaskAdapter extends Task {
    private LegacyTask legacyTask;

    public LegacyTaskAdapter(LegacyTask legacyTask) {
        super(new Builder(legacyTask.getLegacyDescription()).priority(1));
        this.legacyTask = legacyTask;
    }
}
