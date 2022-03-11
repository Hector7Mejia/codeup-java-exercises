package shapes;

public class Rectangle  extends Quadrilateral implements Measurable {
protected double length;
protected double width;

    public Rectangle(double length, double width) {
        super(length, width);
        setWidth(5.5);
        setLength(5.5);

    }
    @Override
    public double getPerimeter() {
        return (length * 2) + (width * 2);
    }

    @Override
    public double getArea() {
        return this.length * this.length;
    }

//    public Rectangle(double width, double length) {
//        this.width = width;
//        this.length = length;
//        System.out.println("In the Rectangle constructor.");
//    }
//
//    public double getArea() {
//        return length * width;
//    }
//
//    public double getPerimeter() {
//        return 2 * (length + width);
//    }

    // accessors
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }


}
