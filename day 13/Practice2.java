class Book {
    private String title, author, genre;
    private double price;
    private int publicationYear;
    private boolean isAvailable;

    Book(String title, String author, String genre, int publicationYear, double price) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.price = price;
        this.publicationYear = publicationYear;
        this.isAvailable = true;
    }

    Book(String title, String author, String genre, int publicationYear, double price, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.price = price;
        this.publicationYear = publicationYear;
        this.isAvailable = isAvailable;
    }

    String getTitle() {
        return title;
    }

    void setTitle(String title) {
        this.title = title;
    }

    String getAuthor() {
        return author;
    }

    void setAuthor(String author) {
        this.author = author;
    }

    boolean checkAvailability() {
        if (isAvailable == true) {
            return true;
        } else {
            return false;
        }
    }

    String borrowBook() {
       
        if (isAvailable == true) {
            isAvailable = false;
            return "the book is available for borrowing";
        } else {
            return "the book has been borrowed";
        }

        // void returnBook() {
        // isAvailable = true;
        // }
    }
}

public class Practice2 {
    public static void main(String[] args) {
        Book b1 = new Book("the identity project", "author", "non-fiction", 2023, 300);
        String author = b1.getAuthor();
        System.out.println(author   );
    }
}
