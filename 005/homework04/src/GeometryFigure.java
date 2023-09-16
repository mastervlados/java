import java.util.ArrayList;
import java.util.List;

public class GeometryFigure {
    private static List<IShape> toolbox;

    public GeometryFigure() {
        this.toolbox = new ArrayList<IShape>();
    }

    // Method for adding a new shape
    public void addShapeToToolbox(IShape figure) {
        toolbox.add(figure);
    }

    // Method for deliting a shape
    public void deleteShapeFromToolboxByIndex(int index) {
        toolbox.remove(index);
    }

    // Method for finding a shape
    public IShape findShapeInToolboxByIndex(int index) {
        return toolbox.get(index);
    }

    // Method to show info about a shape
    public void getInfoAboutShapeByIndex(int index) {

        IShape figure = toolbox.get(index);

        if (figure != null) {
            System.out.printf("%s | S=%.2f P=%.2f \n", figure, figure.getArea(), figure.getPerimeter());
        }
    }

}
