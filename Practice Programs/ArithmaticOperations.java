import java.util.Scanner;

public class ArithmaticOperations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Simple Calculator");
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();

        System.out.println("Addition of numbers is " +  (num1 + num2));
        System.out.println("Subtraction of numbers is " +  (num1 - num2));
        System.out.println("Division of numbers is " +  (num1 / num2));
        System.out.println("Multiplication of numbers is " +  (num1 * num2));
        System.out.println("Modulas of numbers is " +  (num1 % num2));
    }
}
