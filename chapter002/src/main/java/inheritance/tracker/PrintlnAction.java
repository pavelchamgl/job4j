package inheritance.tracker;

public class PrintlnAction extends BaseAction{

    public PrintlnAction(int key) {
        super(key, "=== All Item ====");
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        for (Item item : tracker.findAll()) {
            System.out.println(String.format("%s %s", item.getId(), item.getName()));
        }
        return true;
    }
}