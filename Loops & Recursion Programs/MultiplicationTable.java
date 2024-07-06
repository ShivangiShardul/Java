import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Multiplication Table\n");

        System.out.print("Enter the number : ");
        int num = input.nextInt();
        multiplicationTable(num);
    }

    public static void multiplicationTable(int num){
        System.out.println("Multiplication Table of " + num + " is");

        for (int i = 1; i <= 10 ; i++){
            System.out.println(num + " X " + i + " = " + num * i);
        }
    }
}
