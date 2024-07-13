package Intermediate_Terminate_Operations;

import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateUsingDistinct {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,2,3,4,5,6,7,8,2,1,1,1);

        List<Integer> distinctnumbers =
                numbers.stream()
                        .distinct()
                        .collect(Collectors.toList());

        System.out.println(numbers);
        System.out.println(distinctnumbers);
    }
}
