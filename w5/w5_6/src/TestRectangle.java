public class TestRectangle {

    public static void main(String[] args) {
        Rectangle r = new Rectangle(-2, -5);
        System.out.println(r.getWidth());
        System.out.println(r.getHeight());

        r.setWidth(50);
        r.setHeight(200);
        System.out.println(r.getWidth());
        System.out.println(r.getHeight());
    }
}


class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width <1 ? 1 : (width >100 ? 100 : width);
        if (height < 1) {
            this.height = 1;
        } else if (height > 100) {
            this.height = 100;
        } else {
            this.height = height;
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width < 1) {
            this.width = 1;
        } else if (width > 100) {
            this.width = 100;
        } else {
            this.width = width;
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height < 1) {
            this.height = 1;
        } else if (height > 100) {
            this.height = 100;
        } else {
            this.height = height;
        }
    }

}