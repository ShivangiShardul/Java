package in.Abstraction.Program1;

public class TestShape {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Square square = new Square(10.3);

        System.out.printf("Area of circle is %.2f\n ",circle.calculateArea());
        System.out.printf("Area of square is %.2f\n ",square.calculateArea());
    }
}
