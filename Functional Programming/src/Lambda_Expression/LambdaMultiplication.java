package Lambda_Expression;

import java.util.function.BinaryOperator;

public class LambdaMultiplication {
    public static void main(String[] args) {
        BinaryOperator<Integer> multi = (a,b) -> a * b;

        int result = multi.apply(12,5);
        System.out.println(result);
    }
}
