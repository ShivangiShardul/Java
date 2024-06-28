import java.util.Scanner;

public class BitwiseRightShift {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Bitwise Right Shift Calculation");
        System.out.print("Please, Enter the Number : ");
        int num1 = input.nextInt();

        int result = num1 >> 1;

        System.out.println("Bitwise Right Shift of two numbers is " + result);
    }
}
