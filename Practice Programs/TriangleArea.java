import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Area of Triangle Calculator");

        System.out.print("Enter the base of triangle in cms : ");
        float base = input.nextFloat();
        System.out.print("Enter the height of triangle in cms : ");
        float height = input.nextFloat();

        float area = ((float) 1 /2) * base * height;
        System.out.println("Area of triangle is " + area + " cms");
    }
}
