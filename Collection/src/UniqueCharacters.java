import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class UniqueCharacters {
    public static void main(String[] args) {
        Set<Character> unique = new HashSet<>();
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your string : ");
        String str = input.next();

        for (char c : str.toCharArray()) {
            unique.add(c);
        }

        System.out.printf("Your string has %d unique characters",unique.size());
    }
}
