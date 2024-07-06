import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println("Welcome to Sum of Digit Calculator");
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = input.nextInt();
        int sum = sumOfDigits(num);
        System.out.println("Sum of digits of " + num + " is " + sum);
    }

    public static int sumOfDigits(int num){
        int sum = 0;
        while (num > 0){
            int rem = num % 10;
            sum += rem;
            num = num / 10;
        }
        return sum;
    }
}
