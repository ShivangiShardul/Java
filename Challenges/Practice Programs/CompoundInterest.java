import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Compound Interest Calculator");

        System.out.print("Please enter the principle amount Rs: ");
        int principle = input.nextInt();
        System.out.print("Now, Please enter the rate(percentage) interest: ");
        float rate = input.nextFloat();
        System.out.print("Finally, Please enter the duration(year): ");
        float time = input.nextFloat();

        double CI = principle * Math.pow((1 + rate / 100), time);

        System.out.println("\n\n Compound Interest is " + CI + "Rs");
    }
}
