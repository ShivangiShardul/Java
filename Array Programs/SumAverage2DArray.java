class SumAverage2DArray {
    public static void main(String[] args) {
        System.out.println("Welcome to Sum & Average Calculator od 2D Array\n");
        int[][] numArray = ArrayUtility.input2DArray();
        long sum = sum(numArray);
        double avg = average(numArray);
        System.out.println("Sum of 2D Array is :" + sum);
        System.out.println("Average of 2D Array is :" + avg);
    }

    public static long sum(int[][] numArray){
        int i = 0;
        long sum = 0;
        while (i < numArray.length){
            int j = 0;
            while(j < numArray[i].length) {
                sum += numArray[i][j];
                j++;
            }
            i++;
        }
        return sum;
    }

    public static double average(int[][] numArray) {
        if(numArray.length == 0){
            return 0;
        }
        int rows = numArray.length;
        int cols = numArray[0].length;
        double sum = sum(numArray);
        return sum / (rows * cols);
    }

}
