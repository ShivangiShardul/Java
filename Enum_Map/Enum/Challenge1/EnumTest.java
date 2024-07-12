package Enum_Map.Enum.Challenge1;

public class EnumTest {
    public static void main(String[] args) {
        System.out.println("Printing all the days of the week");
//        System.out.println(Day.MONDAY);

        for (Day day : Day.values()) {
            System.out.println(day);
        }
    }
}
