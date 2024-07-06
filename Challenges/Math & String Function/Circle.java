import java.util.Scanner;

public class Circle {
    double radiusInMm;

    Circle(double radiusInMm){
        this.radiusInMm = radiusInMm;
    }

    double getCircumference(){
        return 2 * radiusInMm * Math.PI;
    }

    double getArea(){
        return Math.PI * Math.pow(radiusInMm,2);
    }

    @Override
    public String toString() {
        return "Circle Props:  Radius in mm : " + radiusInMm + " ,Area in mm2 : " + getArea() + " ,Circumference in mm : " + getCircumference();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to World of Circle");

        System.out.print("Please Enter the radius of circle in mm : ");
        double radius = input.nextDouble();

        Circle circle = new Circle(radius);
        System.out.println(circle);
    }
}
