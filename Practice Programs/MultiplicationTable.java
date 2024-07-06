import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        greeting();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = input.nextInt();
        table(num);
    }

    public static void greeting(){
        System.out.println("Welcome to Calculating Multiplication Table");
    }

    public static void table(int num){
        System.out.println("Multiplication Table of " + num + " is");

        int i = 1;    //initialisation
        while (i <= 10){      //condition
            System.out.println(num + " X " + i + " = " + num * i);
            i++;            //updation
        }
    }
}

