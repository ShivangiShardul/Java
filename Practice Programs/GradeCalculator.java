import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Grade Calculator");
        System.out.print("Please Enter your Marks in percentage : ");
        float percentage = input.nextFloat();

        if (percentage >= 90){
            System.out.println("Excellent, you have got Grade A");
        } else if (percentage >= 75) {
            System.out.println("Very Good, you have got Grade B");
        } else if (percentage >= 60) {
            System.out.println("Good, you have got Grade C");
        } else if (percentage >= 30) {
            System.out.println("Congratulations, you have got Grade D");
        } else {
            System.out.println("Sorry,you have fail the examination, you have got Grade F");
        }
    }
}
