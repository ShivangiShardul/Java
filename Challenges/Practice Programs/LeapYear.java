import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome Leap Year Checker");

        System.out.print("Please, Enter the year to check: ");
        int year = input.nextInt();

        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
            System.out.println(year + " is a Leap Year");
        } else{
            System.out.println(year + " is not a Leap Year");
        }

    }
}
