import java.util.Scanner;

class ArrayOccurrences {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Finding the No. of Occurrences in Array :");

        int[] numArray = ArrayUtility.inputArray();
        System.out.print("Now, Enter the number you want to check : ");
        int num = input.nextInt();

        int count = noOfOccurrences(numArray,num);

        System.out.print("No of occurrences of " + num + " is " + count);
    }

        public static int noOfOccurrences(int[] numArray,int num){
            int i = 0;
            int occ = 0;
            while (i < numArray.length) {
                if (num == numArray[i]) {
                    occ++;
                }
                i++;
            }
            return occ;
        }
    }
