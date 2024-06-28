import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Prime Number Checker");

        System.out.print("Please enter the number : ");
        int num = input.nextInt();

        if(prime(num)){
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not a prime number");
        }
    }

    public static boolean prime(int num) {
        if(num == 2){
            return true;
        }

        int i = 2;
        while (i < num){
           if (num % i == 0){
                return false;
           }
           i++;
        }
        return true;
    }
}
