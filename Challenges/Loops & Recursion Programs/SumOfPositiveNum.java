import java.util.Scanner;

public class SumOfPositiveNum {
    public static void main(String[] args) {
        System.out.println("Welcome in Positive Number Adder");
        int[] arr = ArrayUtility.inputArray();

        int sum = 0;
        for(int num : arr){
            if (num < 0){
                continue;  //this can word without this keyword also
            }
            sum += num;
        }

        System.out.println("Sum of Numbers is " + sum);
    }
}
