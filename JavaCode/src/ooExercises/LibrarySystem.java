package ooExercises;

import java.util.Scanner;

public class LibrarySystem {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Book b1 = new Book("Harry Potter", "JK Rolling");
        System.out.println("Number of books: " + Book.getNoOfBooks());
        manageBook(b1);

        Member m1 = new Member("Michael", 1);

        System.out.println(m1.getMemberDetails());
    }

    public static void manageBook(Book book) {
        int choice;

        do {
            System.out.println("[1: Borrow Book, 2: Return Book, 3: Exit]");
            choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                book.borrowBook();
            } else if (choice == 2) {
                book.returnBook();
            } else if (choice == 3) {
                System.out.println("Existing...");
            } else {
                System.out.println("Invalid choice!");
            }

            System.out.println(book.getBookDetails());
        } while (choice != 3);
    }
}
