import java.util.Scanner;

public class OccurrencesInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Occurrences Counter");
        int[] arr = ArrayUtility.inputArray();

        System.out.print("Enter the number : ");
        int num1 = input.nextInt();

        int count = countOccurrences(arr,num1);
        System.out.println("Number " + num1 + " appears " + count + " times in array");
    }

    public static int countOccurrences(int[] arr, int element){
        int count = 0;
        for (int num: arr){
            if(num == element) count++;
        }
        return count;
    }
}
