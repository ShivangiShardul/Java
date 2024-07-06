import java.util.Scanner;

public class CalculatorSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Simple Calculator\n");

        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Now, Enter the second number: ");
        int num2 = input.nextInt();
        System.out.print("Finally, Enter the the operator: ");
        String ope = input.next();

        int result = calculator(num1,num2,ope);
        System.out.println("Your result is " + result);

    }

    public static int calculator(int num1, int num2, String ope){
        return switch (ope){
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1 * num2;
            case "/" -> num1 / num2;
            case "%" -> num1 % num2;
            default -> 00;
        };
    }

}
