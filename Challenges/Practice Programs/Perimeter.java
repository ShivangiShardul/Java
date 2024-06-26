import java.util.Scanner;

public class Perimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("We are Calculating Perimeter of Quadrilateral");

//        System.out.print("Enter the Side 1: ");
//        float side1 = input.nextFloat();
//        System.out.print("Enter the Side 2: ");
//        float side2 = input.nextFloat();
//        System.out.print("Enter the Side 3: ");
//        float side3 = input.nextFloat();
//        System.out.print("Enter the Side 4: ");
//        float side4 = input.nextFloat();

        System.out.println("Enter the all 4 sides in cms : ");
        float side1 = input.nextFloat();
        float side2 = input.nextFloat();
        float side3 = input.nextFloat();
        float side4 = input.nextFloat();

        float perimeter = side1 + side2 + side3 + side4;
        System.out.println("Perimeter is " + perimeter + " cms");
    }
}
