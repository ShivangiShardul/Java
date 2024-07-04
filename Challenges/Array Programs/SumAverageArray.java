class SumAverageArray {
    public static void main(String[] args) {
        System.out.println("Welcome to Array sumOfDiagonal and average");
        int[] numArray = ArrayUtility.inputArray();
        long sum = sum(numArray);
        double average = average(numArray);
        System.out.println("Sum of the numbers is : " + sum);
        System.out.println("Average of the numbers is : " + average);
    }

    public static long sum(int[] numArray ){
        long sum = 0;
        int i = 0;
        while (i < numArray.length){
            sum += numArray[i];
            i++;
        }
        return sum;
    }

    public static double average(int[] numArray ){
        double sum = sum(numArray);
        return (sum/numArray.length);
    }
}
