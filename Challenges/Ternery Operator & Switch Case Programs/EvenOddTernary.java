import java.util.Scanner;

public class EvenOddTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Even Odd Detector Using Ternary Operator");

        System.out.print("Enter the number to check : ");
        int num = input.nextInt();

        String result = (num % 2) == 0 ? "Even" : "Odd" ;
        System.out.println("Your number is " + result);

//        EvenOddTernary evenodd = new EvenOddTernary();
//        evenodd.evenOdd(num);

    }

    public void evenOdd(int num){
        boolean evenOdd = (num % 2) == 0;

        if(evenOdd){
            System.out.println(num + " is a even number");
        } else {
            System.out.println(num + " is a odd number");
        }
    }
}
