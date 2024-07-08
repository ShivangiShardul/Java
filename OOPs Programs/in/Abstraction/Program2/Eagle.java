package in.Abstraction.Program2;

public class Eagle extends Bird{

    protected Eagle() {
        super("Eagle");
    }

    @Override
    public void fly() {
        System.out.println("Eagle is flying...");
    }
}
