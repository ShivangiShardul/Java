import java.util.Scanner;

public class BitwiseLeftShift {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Bitwise Left Shift Calculation");
        System.out.print("Please, Enter the Number : ");
        int num1 = input.nextInt();

        int result = num1 << 4;

        System.out.println("Bitwise Left Shift of number is " + result);
    }
}
