import java.util.Scanner;

public class SumOf2Num {
    public static void main(String[] args) {
        System.out.println("Enter to Our Calculator");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the First Number: ");
        int num1 = input.nextInt();
        System.out.print("Now, Please Enter the Second Number: ");
        int num2 = input.nextInt();
        int add = num1 + num2;
        System.out.println("Addition of 2 numbers you have enter is " + add);
    }
}
