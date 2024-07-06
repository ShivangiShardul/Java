import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Odd Even Checker");
        System.out.print("Enter the number : ");
        float num = input.nextFloat();

        if(num % 2 == 0){
            System.out.println(num + " is a even number");
        }else {
            System.out.println(num + " is a odd number");
        }
    }
}
