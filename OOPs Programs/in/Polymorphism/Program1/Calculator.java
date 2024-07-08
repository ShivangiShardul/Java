package in.Polymorphism.Program1;

public class Calculator {
    // method overloading

    public int add(int first, int second){
        return first + second;
    }

    public int add(int first, int second, int third){
        return first + second + third;
    }

    public double add(double first, double second){
        return first + second;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(5,12));
        System.out.println(calc.add(7.5,10));
        System.out.println(calc.add(12,67,9));
    }
}
