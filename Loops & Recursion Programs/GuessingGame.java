import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

            System.out.println("Welcome to Guessing Game");

        int num;

        do {
            System.out.println("Please enter your guess (1 - 20) : ");
            num = input.nextInt();
        }while (!isValidNum(num));

        System.out.println("Congratulation your guess is right");
    }

    public static boolean isValidNum(int num){
        return num == 12;
    }
}
