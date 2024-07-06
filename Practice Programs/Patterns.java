import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
        System.out.println("Welcome to the Patterns Printing\n");
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = input.nextInt();
        rightHalfPyramid(num);
        reverseRightHalfPyramid(num);
        leftHalfPyramid(num);
    }

    public static void reverseRightHalfPyramid(int maxRows){
        System.out.println("Welcome to Printing of Reverse Right Half Pyramid");
        int rows = maxRows;
        while (rows > 0){
            int i = 0;
            while (i < rows){
                System.out.print("* ");
                i++;
            }
            System.out.println();
            rows --;
        }
    }

    public static void leftHalfPyramid(int maxRows){
        System.out.println("Welcome to Printing of Left Half Pyramid");
        int rows = maxRows;
        while (rows > 0){
            int j = 0;
            while (j < rows){
                System.out.print("  ");
                j++;
            }
            int i = 0;
            while (i <= maxRows - rows){
                System.out.print("* ");
                i++;
            }
            System.out.println();
            rows --;
        }
    }

    public static void rightHalfPyramid(int maxRows){
        System.out.println("Welcome to Printing of Right Half Pyramid");
        int rows = 0;
        while (maxRows > rows){
            System.out.print("*");
            int i = 0;
            while (i < rows) {
                System.out.print(" *");
                i++;
            }
            System.out.println();
            rows++;
        }
    }
}
