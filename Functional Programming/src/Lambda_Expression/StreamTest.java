package Lambda_Expression;

import java.util.List;

public class StreamTest {
    public static void main(String[] args) {
        List<String> names = List.of("Mary","Hop","Minni","Nanny");
        names.stream()
                .forEach(name -> System.out.println(name));
    }
}
