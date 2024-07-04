class ArrayMaxMin {
    public static void main(String[] args) {
        System.out.println("Welcome to Max and Min finder in array :");

        int[] numArray = ArrayUtility.inputArray();

        System.out.println("Max number in array is " + max(numArray));
        System.out.println("Min number in array is " + min(numArray));
    }

    public static int min(int[] numArray){
        if(numArray.length ==0 ){
            return Integer.MIN_VALUE;
        }
        int min = numArray[0];
        int i = 1;
        while(i < numArray.length){
            if (min > numArray[i]){
                min = numArray[i];
            }
            i++;
        }
        return min;
    }

    public static int max(int[] numArray){
        if(numArray.length ==0 ){
            return Integer.MAX_VALUE;
        }
        int max = numArray[0];
        int i = 1;
        while(i < numArray.length){
            if (max < numArray[i]){
                max = numArray[i];
            }
            i++;
        }
        return max;
    }
}
