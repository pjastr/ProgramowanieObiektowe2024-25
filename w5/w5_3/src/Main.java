public class Main {

    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = b1.create();
        b1.setTitle("sdf");
        b1.setPrice(4.5);
        System.out.println(b1.getDesciption());
        b1.show();
    }
}
