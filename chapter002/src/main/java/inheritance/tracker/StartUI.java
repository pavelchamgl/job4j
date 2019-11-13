package inheritance.tracker;

public class StartUI {

    public static void createItem(Input input, Tracker tracker) {
        System.out.println("=== Create a new Item ====");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
    }

    public static void printlnItem(Input input, Tracker tracker) {
        System.out.println("=== all Item ====");
        Item[] result = tracker.findAll();
        for (Item value : result) {
            System.out.println(value);
        }
    }

    public static void replaceItem(Input input, Tracker tracker) {
        System.out.println("=== Edit Item ====");
        String id = input.askStr("Enter Id: ");
        String name = input.askStr("Enter new name: ");
        if (tracker.replace(id, new Item(name))) {
            System.out.println("Update successful.");
        } else {
            System.out.println("Id not found.");
        }
    }

    public static void deleteItem(Input input, Tracker tracker){
        System.out.println("=== Delete Item ====");
        String id = input.askStr("Enter Id: ");
        if (tracker.delete(id)) {
            System.out.println("Delete successful.");
        } else {
            System.out.println("Id not found.");
        }
    }

    public static void findIdItem(Input input, Tracker tracker){
        System.out.println("=== Find item by Id ====");
        String id = input.askStr("Enter Id: ");
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println(item.getName() + " (" + item.getId() + ")");
        } else {
            System.out.println("Id not found.");
        }
    }

    public static void findNameItem(Input input, Tracker tracker){
        System.out.println("=== Find items by Name ====");
        String key = input.askStr("Enter key: ");
        Item[] itemArr = tracker.findByName(key);
        if (itemArr.length != 0) {
            for (Item item : itemArr) {
                System.out.println(item.getName() + " (" + item.getId() + ")");
            }
        } else {
            System.out.println("Key not found.");
        }
    }

    public void init(Input input, Tracker tracker){
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = Integer.valueOf(input.askStr("Select: "));
            if (select == 0) {
                StartUI.createItem(input, tracker);
            } else if (select == 1) {
                StartUI.printlnItem(input, tracker);
            } else if (select == 2) {
                StartUI.replaceItem(input, tracker);
            } else if (select == 3) {
                StartUI.deleteItem(input, tracker);
            } else if (select == 4) {
                StartUI.findIdItem(input, tracker);
            } else if (select == 5) {
                StartUI.findNameItem(input, tracker);
            } else if (select == 6) {
                run = false;
            }
        }
    }

    private void showMenu () {
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
    }

    public static void main (String[]args){
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}