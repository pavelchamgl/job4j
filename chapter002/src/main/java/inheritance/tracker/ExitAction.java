package inheritance.tracker;

public class ExitAction extends BaseAction{

    public ExitAction(int key) {
        super(key, "=== Exit Program ====");
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        return false;
    }
}