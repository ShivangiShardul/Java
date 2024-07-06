class SumOfDiagonalOfArray {
    public static void main(String[] args) {
        System.out.println("Welcome to Sum diagonal elements of Array\n");
        int[][] numArray = ArrayUtility.input2DArray();
        long sum = sumOfDiagonals(numArray);
        System.out.println("Sum is :" + sum);
    }

    public static long sumOfDiagonals(int[][] numArray){
        long leftSum = sumOfLeftDiagonal(numArray);
        long rightSum = sumOfRightDiagonal(numArray);
        long sum = leftSum + rightSum;
        if(numArray.length % 2 != 0 ){
            int ind = numArray.length / 2;
            sum -= numArray[ind][ind];
        }
        return sum;
    }

    public static long sumOfLeftDiagonal(int[][] numArray){
        int i = 0;
        long sum = 0;
        while (i < numArray.length){
            sum += numArray[i][i];
            i++;
        }
        return sum;
    }

    public static long sumOfRightDiagonal(int[][] numArray){
        int i = 0;
        long sum = 0;
        while (i < numArray.length) {
            int cols = numArray.length - 1 - i;
            sum += numArray[i][cols];
            i++;
        }
        return sum;
    }

}
