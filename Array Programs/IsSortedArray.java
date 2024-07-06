class IsSortedArray {
    public static void main(String[] args) {
        System.out.println("Welcome to Array Sorting Checker");

        int[] numArray = ArrayUtility.inputArray();

        boolean isDec = isDecreasing(numArray);
        boolean isInc = isIncreasing(numArray);

        if (isInc || isDec){
            System.out.println("Your array is sorted");
        } else {
            System.out.println("Your array is not sorted");
        }
    }

    public static boolean isIncreasing(int[] numArr){
        int i = 1;
        while(i < numArr.length){
            if(numArr[i] < numArr[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }

    public static boolean isDecreasing(int[] numArr){
        int i = 1;
        while(i < numArr.length){
            if(numArr[i] > numArr[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }
}
