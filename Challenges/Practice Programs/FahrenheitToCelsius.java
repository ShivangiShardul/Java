import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Fahrenheit To Celsius Converter");

        System.out.print("Enter the temperature Fahrenheit : ");
        float fah = input.nextFloat();
        float celsius = (fah - 32) * 5 / 9;

        System.out.println("Fahrenheit To Celsius Converted Temperature is " + celsius + "C");
    }
}
