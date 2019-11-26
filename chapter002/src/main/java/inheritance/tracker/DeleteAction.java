package inheritance.tracker;

public class DeleteAction extends BaseAction{

    public DeleteAction(int key) {
        super(key, "=== Delete Item ====");
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