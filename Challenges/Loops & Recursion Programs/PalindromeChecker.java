import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Palindrome Checker\n");

        System.out.print("Please Enter the string to check :");
        String str = input.next();

        System.out.println("Your String is " + (isPalindrome(str) ? "Palindrome" : "Not a Palindrome"));
    }

    public static boolean isPalindrome(String str){
        if (str.length() <= 1) return true;

        int lastPos = str.length() - 1;
        if (str.charAt(0) != str.charAt(lastPos)) return false;

        String newStr = str.substring(1,lastPos);
        return isPalindrome(newStr);
    }
}
