public class ISP {
    // 3) Переписать код в соответствии с Interface Segregation Principle:
    // Подсказка: круг не объемная фигура и этому классу не нужен метод volume().
    public static void main(String[] args) {
        Circle myCircle = new Circle(30.0);
        Cube myCube = new Cube(10);
        System.out.println("Circle area: " + myCircle.area());
        System.out.println("Cube area: " + myCube.area());
        System.out.println("Cube volume: " + myCube.volume());
    }
}
