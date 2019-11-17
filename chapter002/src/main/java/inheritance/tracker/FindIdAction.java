package inheritance.tracker;

public class FindIdAction implements UserAction {
    @Override
    public String name() {
        return "=== Find item by Id ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Enter Id: ");
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println(item.getName() + " (" + item.getId() + ")");
        } else {
            System.out.println("Id not found.");
        }
        return true;
    }
}