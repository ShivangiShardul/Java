import java.util.Scanner;

public class ExitOnExit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome in Exit On Exit Game");

        while (true){
            System.out.print("Enter your Command : ");
            String command = input.next();
            if(command.equalsIgnoreCase("exit")) break;
        }

        System.out.println("You have Successfully Exited the Game");
    }
}
