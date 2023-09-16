public class App {
    public static void main(String[] args) throws Exception {
        GeometryFigure figures = new GeometryFigure();

        Circle circle1 = new Circle(10);
        figures.addShapeToToolbox(circle1);
        figures.getInfoAboutShapeByIndex(0);

        Rectangle rect1 = new Rectangle(10, 5);
        figures.addShapeToToolbox(rect1);
        figures.getInfoAboutShapeByIndex(1);

        Triangle trig1 = new Triangle(5, 7, 9);
        figures.addShapeToToolbox(trig1);
        figures.getInfoAboutShapeByIndex(2);

        Pentagon pent1 = new Pentagon(6);
        figures.addShapeToToolbox(pent1);
        figures.getInfoAboutShapeByIndex(3);
    }
}
