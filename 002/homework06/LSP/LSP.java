public class LSP {
    // 4) Переписать код в соответствии с Liskov Substitution Principle:
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.setHeight(10);
        rect.setWidth(50);
        System.out.println(rect);

        Square box = new Square();
        box.setSize(50);
        box.setHeight(20);
        box.setWidth(20);
        System.out.println(box);
    }
}
