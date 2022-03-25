package shapes;

import util.Input;

import java.util.Scanner;

public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();
        Scanner sc = new Scanner(System.in);

        Circle circle1 = new Circle(25.5);
//        System.out.println(circle1.getRadius());
//        System.out.println(circle1.getArea(25.5));

        System.out.println("Enter the radius of your circle");
//        System.out.println(sc.nextDouble());
        Double radiusInput = sc.nextDouble();
        Circle created = new Circle(radiusInput);
        System.out.println("The area of your circle is " + created.getArea(radiusInput));
//        System.out.println(circle1.getArea(5));
        System.out.println("The circumference of your circle is " + created.getCircumference(radiusInput));


    }
}
