import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        //Swapping Two Numbers by initial values

        /* int num1 = 4;
        int num2 = 20;
        int temp;

        System.out.println("Your initial value of num1 is " + num1 + " and value of num2 is " + num2);

        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("Your Swap value of num1 is " + num1 + " and value of num2 is " + num2); */

        //Swapping Two Numbers by User Input

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the swapping of two numbers:");

        System.out.print("Enter the value 1:");
        int num1 = input.nextInt();
        System.out.print("Enter the value 2:");
        int num2 = input.nextInt();

        int temp;

        System.out.println("Your initial value of num1 is " + num1 + " and value of num2 is " + num2);

        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("Your Swap value of num1 is " + num1 + " and value of num2 is " + num2);
    }
}
