import java.util.Scanner;

public class ProductFloat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Product of two float numbers");
        System.out.print("Enter the first decimal number: ");
        float num1 = input.nextFloat();
        System.out.print("Now, Enter the second decimal number: ");
        float num2 = input.nextFloat();

        float Product = num1 * num2;
        System.out.println("product is " + Product);
    }
}
