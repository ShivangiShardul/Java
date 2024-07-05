public class Book {
    static int totalBooks;

    String title;
    String author;
    String isbn;
    boolean isBorrowed;

    static {
        totalBooks = 0;
    }
    { // object init
        totalBooks++;
    }

    Book(String isbn, String title, String author){
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    Book(String isbn){
        this(isbn, "Unknown", "Unknown");
//        title = "Unknown";
//        author = "Unknown";
    }

    static int getTotalBooks(){
        return totalBooks;
    }

    void borrowBook(){
        if(isBorrowed){
            System.out.println("Book is already borrowed");
        } else{
            this.isBorrowed = true;
            System.out.println("Enjoy " + this.title);
        }
    }

    void returnBook(){
        if(isBorrowed){
            this.isBorrowed = false;
            System.out.println("Hope you enjoyed the book, Please leave a review");
        }else {
            System.out.println("Book is already in the library");
        }
    }

    public static void main(String[] args) {
        Book atomicHabits = new Book("1","Atomic Habits","James Clear");
        Book silence = new Book("2");

        System.out.println(Book.getTotalBooks());
        atomicHabits.borrowBook();
        silence.borrowBook();

        atomicHabits.borrowBook();
        atomicHabits.returnBook();
        atomicHabits.returnBook();

    }

}
