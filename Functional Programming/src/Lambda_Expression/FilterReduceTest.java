package Lambda_Expression;

import java.util.List;

public class FilterReduceTest {
    public static void main(String[] args) {
        List<String > strs = List.of("I am Learning","bad", "Java Programming Basics," ,"not nice","not good",
                "and So far i am liking it", ",I am excited to implements the learning");

        String result =
                strs.stream()
                .filter(str -> str.length() > 10)
                .reduce("",(a,b) -> a + " " + b);

        System.out.println(result);
    }


}
