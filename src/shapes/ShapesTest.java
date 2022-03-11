package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Measurable myShape = new Rectangle(5.5,5.5);
        System.out.println("Perimeter of box1: " + myShape.getPerimeter());
    }
}
