package objectOriented;

public class LibraryApplied {
    public static void main(String[] args) {
        LibraryRegister r1 = new LibraryRegister("Learn to Program JAVA", "Dammu C. C", 20);
        LibraryRegister r2 = new LibraryRegister("JAVA Black Book", "Steven Holzner", 25);
        r1.display();
        r2.display();
        System.out.println("Total number of books: " + LibraryRegister.getNumberOfBooks());
        System.out.println("Total number of books: " + r1.getNumberOfBooks());
        System.out.println("Total number of books: " + r2.getNumberOfBooks());
    }
}
