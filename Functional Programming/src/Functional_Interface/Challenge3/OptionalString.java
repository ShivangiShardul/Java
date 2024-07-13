package Functional_Interface.Challenge3;

import java.util.Optional;

public class OptionalString {
    public static void main(String[] args) {
        System.out.println(toOptinal(null));
        System.out.println(toOptinal(""));
        System.out.println(toOptinal("pop"));
    }

    public static Optional<String> toOptinal(String str){
        if (str == null || str.isEmpty()){
            return Optional.empty();
        }
        return Optional.of(str.toUpperCase());
    }
}
