public class Square extends Rectangle {
    
    public void setSize(int size) {
        super.setWidth(size);
        super.setHeight(size);
    }

    @Override
    public void setWidth(int width) {
        this.setSize(width);
    }

    @Override
    public void setHeight(int height) {
        this.setSize(height);
    }

    @Override
    public String toString() {
        return String.format("Square %dx%d, area: %d", super.getWidth(), super.getHeight(), super.area());
    }
}
