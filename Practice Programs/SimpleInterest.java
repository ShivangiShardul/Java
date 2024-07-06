import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Simple Interest Calculator");

        System.out.print("Please enter the principle amount Rs: ");
        int principle = input.nextInt();
        System.out.print("Now, Please enter the rate(percentage) interest: ");
        float rate = input.nextFloat();
        System.out.print("Finally, Please enter the duration(year): ");
        float time = input.nextFloat();

        float SI = (principle * time * rate) / 100;

        System.out.println("\n\n Simple Interest is " + SI + "Rs");
    }
}
