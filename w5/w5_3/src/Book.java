class Book {
    private String title;
    private double price;

    public Book create(){
        return new Book();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title != null && !title.isEmpty()) {
            this.title = title;
        } else {
            this.title = "";
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            this.price = 0;
        }
    }

    public String getDesciption(){
        return title+" "+price;
    }

    public void show(){
        System.out.println(title+", "+price);
    }
}