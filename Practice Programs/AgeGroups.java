import java.util.Scanner;

public class AgeGroups {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Age Group Categorize System");

        System.out.print("Enter your age : ");
        int age = input.nextInt();

        if (age >= 65) {
            System.out.println("You are Senior Citizen");
        } else if (age >=  20) {
            System.out.println("You are an Adult");
        } else if (age >= 13) {
            System.out.println("You are a Teenager");
        } else {
            System.out.println("You are a Child");
        }
    }
}
