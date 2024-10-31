public class TestBook {

    public static void main(String[] args) {
        System.out.println(Book.getId());
        Book b1 = new Book();
        Book.setId(2);
        System.out.println(Book.getId());
        System.out.println(b1.getId());
    }
}
