package ExceptionProgram;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Calculator");

        System.out.print("Enter first number: ");
        int first = input.nextInt();
        System.out.print("Enter second number: ");
        int second = input.nextInt();

        try {
            int result = first / second;
            System.out.printf("Result is %d", result);
        }
        catch (ArithmeticException exception){
            if (exception.getMessage().equals("/ by zero")){
                System.out.println("Dicide by zero occur");
            } else {
                throw exception;
            }
        }
    }
}
