import java.util.Scanner;

public class PrintingEvenNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Even Number Printer\n");

        System.out.print("Please enter the max range number : ");
        int range = input.nextInt();

        System.out.println("Here is the Even Numbers");

        for(int i = 0; i < range; i++){
            if(i % 2 != 0) continue;
            System.out.println(i);
        }
    }
}
