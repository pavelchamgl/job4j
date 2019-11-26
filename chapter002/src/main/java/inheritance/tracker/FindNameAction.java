package inheritance.tracker;

public class FindNameAction extends BaseAction{

    public FindNameAction(int key) {
        super(key, "=== Find items by Name ====");
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Enter name: ");
        Item[] itemArr = tracker.findByName(name);
        if (itemArr.length != 0) {
            for (Item item : itemArr) {
                System.out.println(String.format("%s %s", item.getId(), item.getName()));
            }
        } else {
            System.out.println("Name not found.");
        }
        return true;
    }
}