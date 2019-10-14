package inheritance.pojo;

public class Library {
    public static void main(String[] args) {
        Book tolstoi = new Book("Война и мир", 2048);
        Book martin = new Book("Clean code", 464);
        Book chehov = new Book("Человек в футляре", 1024);
        Book gogol = new Book("Мертвые души", 999);

        Book[] books = {tolstoi, martin, chehov, gogol};

        for (Book bk : books) {
            System.out.println(bk.getName() + " - " + bk.getPages());
        }

        books[0] = books[3];
        books[3] = tolstoi;

        for (Book bk : books) {
            if (bk.getName().equals("Clean code")) {
                System.out.println(bk.getName() + " - " + bk.getPages());
            }
        }
    }
}