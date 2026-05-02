package objectOriented20Exercises;

public class BookBorrowingSystem {
    private String title, author;
    private boolean isBorrowed;

    BookBorrowingSystem(String title, String author) {
        this.title = title;
        this.author = author;
        this.isBorrowed = false;
    }

    public String bookInfo() {
        return "Booking Info\n" +
                "Book Title: " + title + "\n" +
                "Author: " + author + "\n" +
                "Is Borrowed: " + isBorrowed + "\n";
    }

    public void borrowBook() {
        if (isBorrowed) {
            System.out.println("Book unavailable! Cannot be borrowed.");
        } else {
            this.isBorrowed = true;
            System.out.println("Book borrowed!");
        }
    }

    public void returnBook() {
        this.isBorrowed = false;
        System.out.println("Book returned!");
    }
}
