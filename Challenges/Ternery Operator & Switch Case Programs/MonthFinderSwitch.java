import java.util.Scanner;

public class MonthFinderSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Month Name Finder");

        System.out.print("Enter the month number(1-12) : ");
        int month = input.nextInt();

        String monthName = getMonthname(month);

        System.out.println("Month name is " + monthName);
    }

    public static String getMonthname(int month){
        return switch (month){
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Unknown, Please Enter valid number";
        };
    }
}
