package objectOriented20Exercises;

import java.util.Scanner;

public class BookBorrowingSystemApp {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        BookBorrowingSystem book1 = new BookBorrowingSystem("Harry Potter", "J.K. Rolling");
        manageBook(book1);
    }

    public static void manageBook(BookBorrowingSystem book) {
        int choice;
        do {
            System.out.println("[1: Book Details, 2: Borrow Book, 3: Return Book, 4: Exit]");
            choice = sc.nextInt();
            if (choice == 1) {
                System.out.println(book.bookInfo());
            } else if (choice == 2) {
                book.borrowBook();
            } else if (choice == 3) {
                book.returnBook();
            } else if (choice == 4) {
                System.out.println("Exiting...");
            } else {
                System.out.println("Invalid input");
            }
        } while (choice != 4);
    }
}
