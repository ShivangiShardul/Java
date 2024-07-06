import java.util.Scanner;

public class BitwiseAND {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Bitwise AND Calculation");
        System.out.print("Please, Enter the first number : ");
        int num1 = input.nextInt();
        System.out.print("Now, Enter the second number : ");
        int num2 = input.nextInt();

        int result = num1 & num2;

        System.out.println("Bitwise AND of two numbers is " + result);
    }
}
