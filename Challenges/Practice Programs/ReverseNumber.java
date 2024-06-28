import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println("Welcome to Reverse the Number System");
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = input.nextInt();
        int reverse = reverse(num);
        System.out.println("Reverse of " + num + " is " + reverse);
    }

    public static int reverse(int num){
        int reverse = 0;
        while (num > 0){
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }
        return reverse;
    }
}
