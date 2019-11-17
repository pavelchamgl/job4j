package inheritance.tracker;

public class FindNameAction implements UserAction {
    @Override
    public String name() {
        return "=== Find items by Name ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String key = input.askStr("Enter key: ");
        Item[] itemArr = tracker.findByName(key);
        if (itemArr.length != 0) {
            for (Item item : itemArr) {
                System.out.println(item.getName() + " (" + item.getId() + ")");
            }
        } else {
            System.out.println("Key not found.");
        }
        return true;
    }
}