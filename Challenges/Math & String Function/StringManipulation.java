import java.util.Scanner;

class StringManipulation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to String Manipulation\n");

        System.out.print("Enter your first name : ");
        String firstName = input.next();
        System.out.print("Enter your last name : ");
        String lastName = input.next();

        String name = firstName + " " + lastName;
        System.out.println(name);
        String name1 = firstName.concat(" ").concat(lastName);
        System.out.println(name);

        System.out.println(name.toUpperCase());
    }
}
