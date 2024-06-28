import java.util.Scanner;

public class EvenOddBitwise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Odd Even Checker");
        System.out.print("Enter the number : ");
        int num = input.nextInt();

        if((num & 1) == 1){
            System.out.println(num + " is a odd number");
        }else {
            System.out.println(num + " is a even number");
        }
    }
}
