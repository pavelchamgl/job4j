package inheritance.tracker;

public class DeleteAction implements UserAction {
    @Override
    public String name() {
        return "=== Delete Item ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Enter Id: ");
        if (tracker.delete(id)) {
            System.out.println("Delete successful.");
        } else {
            System.out.println("Id not found.");
        }
        return true;
    }
}