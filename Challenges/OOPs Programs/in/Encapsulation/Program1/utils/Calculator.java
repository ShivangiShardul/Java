package in.Encapsulation.Program1.utils;

import in.Encapsulation.Program1.geometry.Circle;
import in.Encapsulation.Program1.geometry.Rectangle;

public class Calculator {
    public static void main(String[] args) {

        Circle circle = new Circle(5.5);
        Rectangle rectangle = new Rectangle(10,5);

        double cirArea = Math.PI * Math.pow(circle.radius , 2);
        double rectArea = rectangle.breadth * rectangle.length;

        System.out.printf("Area of the circle is : %.2f, Area of rectangle is : %.2f",cirArea,rectArea);

    }
}
