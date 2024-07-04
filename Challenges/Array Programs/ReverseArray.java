class ReverseArray {
    public static void main(String[] args) {
        System.out.println("Welcome to Array Reversal\n");

        int[] numArray = ArrayUtility.inputArray();
        reverse(numArray);
        System.out.println("Your reversed array is :");
        ArrayUtility.displayArray(numArray);
    }

    public static void reverse(int[] arr) {
        int i = 0;
        while (i < (arr.length/2)){
            int swap = arr[i];
            arr[i] = arr[(arr.length -1) - i];
            arr[(arr.length -1) - i] = swap;
            i++;
        }
    }
}
