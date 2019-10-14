package inheritance.pojo;

public class Book {
    private String name;
    private int pages;

    Book(String name, int pages) {
        this.name = name;
        this.pages = pages;
    }

    String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}