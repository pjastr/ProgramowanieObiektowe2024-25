import java.util.ArrayList;

public class TestBook {

    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book());
        books.add(new Book());
        books.add(new Book());
        books.get(0).setTitle("Pan Tadeusz");
        books.get(1).setTitle("gffg");
        books.get(2).setTitle("fgfgh");
        books.get(0).setPrice(3.4);
        books.get(1).setPrice(6.4);
        books.get(2).setPrice(12.9);

        Library l1 = new Library();
        l1.setBooks(books);
    }
}
