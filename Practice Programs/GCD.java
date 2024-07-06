import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to GCD Calculation");
        System.out.print("Please, Enter the first number : ");
        int num1 = input.nextInt();
        System.out.print("Now, Enter the second number : ");
        int num2 = input.nextInt();

        int gcd = gcd(num1 , num2);
        System.out.println("GCD of two numbers is " + gcd);
    }

    public static int gcd(int first, int second){
        int gcd = 1;
        int i = 2;
        int min = Math.min(first, second);

        while (min >= i){
            if(first % i == 0 && second % i == 0){
                gcd = i;
            }
            i++;
        }
        return gcd;
    }
}
