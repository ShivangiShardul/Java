package in.Abstraction.Program2;

public abstract class Bird implements Flyable{

    private final String breed;

    protected Bird(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }
}
