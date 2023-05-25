public class Rectangle {
    private int width;
    private int height;

    public void setWidth(int width) {
        this.width = width;
    }

    public int getWidth() {
        return this.width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return this.height;
    }

    public int area() {
        return this.width * this.height;
    }

    @Override
    public String toString() {
        return String.format("Rectangle %dx%d, area: %d", this.width, this.height, this.area());
    }
}
