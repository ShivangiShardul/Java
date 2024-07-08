package in.Polymorphism.Program2;

public class Test {
    // method overriding

    public static void main(String[] args) {
        Car car = new Car();
        Vehicle vehicle = new Vehicle();
        vehicle.service();
        car.service();
    }
}
