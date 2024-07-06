package in.Inheritance.Program1;

public class LibraryItem {
    private String itemId;
    private String title;
    private String author;

    public void checkout(){
        System.out.println("Checkout");
    }

    public void returnItem(){
        System.out.println("Returning the item");
    }
}
