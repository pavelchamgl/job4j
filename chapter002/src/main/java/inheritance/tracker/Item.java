package inheritance.tracker;

public class Item {
    private String id;
    private String name;

    public Item(String name) {
        this.name = name;
    }

    String getId() {
        return id;
    }

    void setId(String id) {
        this.id = id;
    }

    String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
