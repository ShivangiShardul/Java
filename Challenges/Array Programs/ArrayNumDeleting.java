import java.util.Scanner;

class ArrayNumDeleting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Array Deletion");

        int[] numArray = ArrayUtility.inputArray();

        System.out.print("Now, Enter the number you want to delete : ");
        int num = input.nextInt();

        int[] newArr = deleteNumber(numArray, num);
        System.out.println("Here is your new array");
        ArrayUtility.displayArray(newArr);
    }

    public static int[] deleteNumber(int[] numArray, int num){
        int occ = ArrayOccurrences.noOfOccurrences(numArray , num);
        if(occ == 0){
            return numArray;
        }
        int newSize = numArray.length - occ;
        int[] newArr = new int[newSize];

        int i = 0, j = 0;
        while (i < numArray.length){
            if(numArray[i] != num){
                newArr[j] = numArray[i];
                j++;
            }
            i++;
        }
        return newArr;
    }
}
