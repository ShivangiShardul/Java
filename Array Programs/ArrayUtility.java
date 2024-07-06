import java.util.Scanner;

public class ArrayUtility {
    public static int[] inputArray() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements : ");
        int size = input.nextInt();
        int[] nums = new int[size];

        int i = 0;
        while (i < size) {
            System.out.print("Enter the number " + (i + 1) + " element : ");
            nums[i] = input.nextInt();
            i++;
        }
        return nums;
    }

    public static int[][] input2DArray() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int rows = input.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = input.nextInt();
        int[][] numArr = new int[rows][cols];

        int i = 0;
        while (i < rows) {
            int j = 0;
            while (j < cols){
                System.out.print("Enter the element row : " + (i + 1) + ", column : "+ (j + 1) + " : ");
                numArr[i][j] = input.nextInt();
                j++;
            }
            i++;
        }
        return numArr;
    }

    public static void displayArray(int[] numArray) {
        int i = 0;
        while (i < numArray.length){
            System.out.print(numArray[i] + " ");
            i++;
        }
        System.out.println();
    }
}
