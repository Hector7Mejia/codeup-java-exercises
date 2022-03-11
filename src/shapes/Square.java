package shapes;

public class Square extends Quadrilateral {
    public Square(double length, double width) {
        super(length, width);
    }

    @Override
    public void setLength(double length) {

    }

    @Override
    public void setWidth(double width) {

    }

    @Override
    public double getPerimeter() {
        return 4 * length;
    }

    @Override
    public double getArea() {
        return length * width;
    }
    //java requirement

//    public Square(double width, double length) {
//        super(width, length);
//    }
//    public Square(double side) {
//        super(side, side);
//        System.out.println("in square constructor");
//    }

}
