package inheritance.tracker;

public class ReplaceAction extends BaseAction{

    public ReplaceAction(int key) {
        super(key, "=== Edit Item ====");
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        boolean result = false;
        String id = input.askStr("Enter Id: ");
        String name = input.askStr("Enter new name: ");
        Item item = new Item(name);
        item.setId(id);
        if (tracker.replace(id, item)) {
            System.out.println("Replace successfull");
            result = true;
        }else {
            System.out.println("This ID not found");
        }
        return result;
    }
}