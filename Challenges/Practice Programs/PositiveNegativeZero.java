import java.util.Scanner;

public class PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Number State Checker");

        System.out.print("Please enter the number : ");
        float num = input.nextFloat();

        if(num > 0){
            System.out.println(num + " is a Positive number");
        }else if(num < 0){
            System.out.println(num + " is a Negative number");
        }else {
            System.out.println("Number is Zero");
        }
    }
}
