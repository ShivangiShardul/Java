import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to LCM Calculation");
        System.out.print("Please, Enter the first number : ");
        int num1 = input.nextInt();
        System.out.print("Now, Enter the second number : ");
        int num2 = input.nextInt();

        int lcm = lcm(num1 , num2);
        System.out.println("LCM of two numbers is " + lcm);
    }

    public static int lcm(int num1, int num2){
        int i = 1;
        while (true){
            int factor = num1 * i;
            if(factor % num2 == 0){
                return factor;
            }
            i++;
        }
    }
}
