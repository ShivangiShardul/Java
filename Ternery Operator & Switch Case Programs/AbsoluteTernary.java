import java.util.Scanner;

public class AbsoluteTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Absolute Number Converter");

        System.out.print("Enter the number : ");
        int num = input.nextInt();

        int absolute = num >= 0 ? num : -num;
        System.out.println("Absolute value is " + absolute);
    }
}
