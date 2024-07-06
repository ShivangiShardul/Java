import java.util.Scanner;

class ArrayToString {

    public static void main(String[] args) {
//
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements : ");
        int size = input.nextInt();
        String[] arr = new String[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter the number " + (i + 1) + " element : ");
            arr[i] = input.next();
        }

        StringBuilder sb = new StringBuilder();
        for (String str : arr) {
            sb.append(str).append(" ");
        }
        System.out.println(sb);

//        String[] arr = new String[] {
//                "I" , "am" , "learning" , "the" , "Java" , "programming" , "and" ,
//                "I" , "am", "liking" , "it" , "so" , "far"
//        };
//
//      StringBuilder sb = new StringBuilder();
//        for (String str : arr) {
//            sb.append(str).append(" ");
//        }
//
//        System.out.println(sb);
    }
}
