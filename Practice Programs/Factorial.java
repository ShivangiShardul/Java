import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Welcome to Factorial Calculator");
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = input.nextInt();
        long fact = fact(num);
        System.out.println("Factorial of " + num + " is " + fact);
    }

    public static long fact(int num){

        if (num < 2) {
            return 1;
        }

        long fact = 1;
        int i = 2;
        while(i <= num) {
           fact *= i;
           i++;
        }

        return fact;
    }
}
