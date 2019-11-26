package inheritance.tracker;

public class StubAction extends BaseAction {
    private boolean call = false;

    protected StubAction(int key) {
        super(key, "Stub action");
    }

    @Override
    public String info() {
        return "Stub action";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        call = true;
        return false;
    }
    public boolean isCall() {
        return call;
    }
}