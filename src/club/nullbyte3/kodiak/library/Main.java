package club.nullbyte3.kodiak.library;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("Java Programming", "John Doe", "12345");
        Book book2 = new Book("Data Structures", "Jane Smith", "67890");

        LibraryMember member1 = new LibraryMember("Alice", 1);
        LibraryMember member2 = new LibraryMember("Bob", 2);

        library.reserveBook(member1, book1);
        library.reserveBook(member2, book2);

        library.displayReservedBooks(member1);
        library.displayReservedBooks(member2);

        System.out.println("Alice's reserved books:");
        library.displayReservedBooks(member1);

        library.cancelReservation(member1, book1);
        System.out.println("After cancellation:");
        library.displayReservedBooks(member1);
    }
}
