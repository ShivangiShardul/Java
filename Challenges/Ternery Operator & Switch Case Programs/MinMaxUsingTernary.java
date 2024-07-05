import java.util.Scanner;

public class MinMaxUsingTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Min Max Using Ternary Operator");

        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();

        MinMaxUsingTernary ternary = new MinMaxUsingTernary();

        int min = ternary.min(num1,num2);
        int max = ternary.max(num1,num2) ;

        System.out.println("Minimum number is " + min);
        System.out.println("Maximum number is " + max);

    }

    public int min(int num1, int num2){
        int min = num1 > num2 ? num2 : num1 ;
        return min;
    }

    public int max(int num1, int num2){
        int max = num1 < num2 ? num2 : num1 ;
        return max;
    }
}
