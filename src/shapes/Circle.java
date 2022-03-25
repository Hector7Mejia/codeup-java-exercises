package shapes;

//import static com.sun.tools.doclint.Entity.pi;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public  double getArea(double radius) {
        double area = Math.PI * radius * radius;
        return  Math.round(area * 100.0) / 100.0;
    }

    public double getCircumference(double radius) {
//        circumference = 2 x pi x radius
double circumference = 2 * Math.PI * radius;
return Math.round(circumference * 100.0) / 100.0;
    }

    //accessors
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

}
