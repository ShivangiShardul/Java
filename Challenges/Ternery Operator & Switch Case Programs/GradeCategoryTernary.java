import java.util.Scanner;

public class GradeCategoryTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Grade Category Display");

        System.out.print("Enter the score : ");
        int score = input.nextInt();

        String grade = (score >= 80 && score < 100) ? "You got High Grade" :
                            (score >= 50 && score < 80) ? "You got Moderate Grade" :
                               (score >= 0 && score < 50)  ? "You got Low Grade" : "Enter valid score";
        System.out.println(grade);
    }
}
