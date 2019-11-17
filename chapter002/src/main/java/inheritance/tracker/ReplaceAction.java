package inheritance.tracker;

public class ReplaceAction implements UserAction{
    @Override
    public String name() {
        return "=== Edit Item ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Enter Id: ");
        String name = input.askStr("Enter new name: ");
        Item item = new Item(name);
        item.setId(id);
        tracker.replace(id, item);
        return true;
    }
}
