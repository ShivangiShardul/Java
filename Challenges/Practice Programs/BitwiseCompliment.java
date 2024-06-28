import java.util.Scanner;

public class BitwiseCompliment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Bitwise NOT Calculation");
        System.out.print("Please, Enter the Number : ");
        int num1 = input.nextInt();

        int result = ~num1;

        System.out.println("Bitwise NOT of number is " + result);
    }
}
