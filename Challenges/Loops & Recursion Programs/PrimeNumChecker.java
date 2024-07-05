import java.util.Scanner;

public class PrimeNumChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Prime Number Checker\n");

        System.out.print("Enter the number to check : ");
        int num = input.nextInt();
        System.out.println("Your number is " + (isPrime(num) ? "Prime" : "Not Prime"));
    }

    public static boolean isPrime(int num){
        for (int i = 2 ; i < num ; i++)
        {
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}
