package ooExercises;

public class Book {
    private String title, author;
    private Boolean isBorrowed;
    private static int noOfBooks = 0;

    Book(String title, String author) {
        this(title, author, false);
    }

    Book(String title, String author, boolean isBorrowed) {
        this.title = title;
        this.author = author;
        this.isBorrowed = isBorrowed;
        Book.noOfBooks++;
    }

    //setters

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    //getters

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean getIsBorrowed() {
        return isBorrowed;
    }

    //methods

    public void borrowBook() {
        if (!isBorrowed) {
            this.isBorrowed = true;
            System.out.println("You borrowed a book!");
        } else {
            System.out.println("This book in unavailable!");
        }
    }

    public void returnBook() {
        if (!isBorrowed) {
            this.isBorrowed = false;
            System.out.println("Borrowed book returned!");
        } else {
            System.out.println("This book is already available!");
        }
    }

    public String getBookDetails() {
        return "Book Details" + "\n" +
                "Book title: " + title + "\n" +
                "Author: " + author + "\n" +
                "Available: " + (isBorrowed ? "No" : "Yes");
    }

    public static int getNoOfBooks() {
        return noOfBooks;
    }
}
