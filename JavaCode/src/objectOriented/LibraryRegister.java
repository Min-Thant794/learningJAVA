package objectOriented;

public class LibraryRegister {

    //instance belongs to object while static belongs to class

    private String bookTitle, author;
    public int quantity;
    public static int numberOfBooks = 0;

    public LibraryRegister (String bookTitle, String author, int quantity) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.quantity = quantity;
        numberOfBooks += quantity;
    }

    public String getBookTitle () {
        return bookTitle;
    }

    public void setBookTitle (String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getAuthor () {
        return author;
    }

    public void setAuthor (String author) {
        this.author = author;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity (int quantity) {
        this.quantity = quantity;
    }

    public static int getNumberOfBooks() {
        return numberOfBooks;
    }

    public void display() {
        System.out.println(bookTitle + "\t" + author + "\t" + quantity);
    }
}
