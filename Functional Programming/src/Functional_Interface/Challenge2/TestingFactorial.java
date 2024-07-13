package Functional_Interface.Challenge2;

import java.util.stream.IntStream;

public class TestingFactorial {
    public static void main(String[] args) {
        System.out.println("Factorial using 2 ways\n");
        int number = 9;

        System.out.print("Factorial using Structural Programming\n");
        System.out.println(factorial(number));

        System.out.print("Factorial using Functional Programming\n");
        IntStream.rangeClosed(2,9)
                .reduce((a,b) -> a*b)
                .ifPresent(System.out::println);
    }

    public static int factorial(int num){
        if (num == 0 || num == 1){
            return 1;
        }

        int fact = 1;
        for (int i = 2; i <= num ; i++) {
            fact *= i;
        }
        return fact;
    }
}
