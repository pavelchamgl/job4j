package inheritance.tracker;

public class PrintlnAction implements UserAction{
    @Override
    public String name() {
        return "=== all Item ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        Item[] result = tracker.findAll();
        for (Item value : result) {
            System.out.println(value);
        }
        return true;
    }
}