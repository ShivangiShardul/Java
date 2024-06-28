import java.util.Scanner;

public class MaxNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Maximum Number Checker");
        System.out.println("Enter the 3 numbers :");
        float num1 = input.nextFloat();
        float num2 = input.nextFloat();
        float num3 = input.nextFloat();

        if(num1 >= num2 && num1 >= num3){
            System.out.println(num1 + " is a maximum number");
        } else if (num2 > num3) {
            System.out.println(num2 + " is a maximum number");
        } else {
            System.out.println(num3 + " is a maximum number");
        }
    }
}
