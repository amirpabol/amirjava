public class Book {
    private String title;
    private String author;
    private Double price;
    private int publicationYear;

    // Default constructor
    public Book() {
        this.title = "Unknown Title";
        this.author = "Unknown Author";
        this.price = 0.0;
        this.publicationYear = 0;
    }
    
    // Constructor with title and author
    public Book(String title, String author){
        this.title = title;
        this.author = author;
        this.price = 0.0;
        this.publicationYear = 0;
    }

    //Constructor with title, author and price
    public Book(String title, String author, Double price){
        this.title = title;
        this.author = author;
        this.price = price;
        this.publicationYear = 0;
    }

    // Constructor with title, author, price and publication year
    public Book(String title, String author, Double price, int publicationYear){
        this.title = title;
        this.author = author;
        this.price = price;
        this.publicationYear = publicationYear;
    }

    public void displayBookDetails(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("Publication Year: " + publicationYear);
        System.out.println("-----------------------");
    }

    public static void main(String[] args) {
        Book b1 = new Book();
        System.out.println("Book in default constructor:");
        b1.displayBookDetails();

        Book b2 = new Book("Harry Potter and the Philosopher's Stone", "J.K. Rowling");
        System.out.println("Book in constructor with title and author:");
        b2.displayBookDetails();

        Book b3 = new Book("Harry Potter and the chamber of secrets", "J.K. Rowlinggg", 100.50);
        System.out.println("Book in constructor with title and author and price:");
        b3.displayBookDetails();

        Book b4 = new Book("Harry Potter and the prizoner of Azkaban", "J.K. Rowlinggggg", 200.50, 2004);
        System.out.println("Book in constructor with title, author, price and publication year:");
        b4.displayBookDetails();

    }

}
