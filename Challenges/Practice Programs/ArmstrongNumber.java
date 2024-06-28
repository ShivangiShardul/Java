import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println("Welcome to Armstrong Number Checker");
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = input.nextInt();
        int armstrong = armstrong(num);

        if(armstrong == num) {
            System.out.println(num + " is a armstrong");
        } else {
            System.out.println(num + " is not a armstrong");
        }
    }

    public static int armstrong(int num){
        int digits = noOfDigits(num);
        int sum = 0;
        while (num > 0){
            int rem = num % 10;
            sum = sum + pow(rem,digits);
            num = num / 10;
        }
        return sum;
    }

    public static int pow(int num1, int num2 ){
        int result = 1;
        int i = 0;
        while (i < num2){
            result *= num1;
            i++;
        }
        return result;
    }

    public static int noOfDigits(int num){
        int digits = 0;
        while (num > 0){
            digits++;
            num /= 10;
        }
        return  digits;
    }
}
