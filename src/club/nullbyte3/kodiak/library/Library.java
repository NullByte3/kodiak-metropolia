package club.nullbyte3.kodiak.library;

public class Library {
    public void reserveBook(LibraryMember member, Book book) {
        if (!book.isReserved()) {
            book.setReserved(true);
            member.addReservedBook(book);
        }
    }

    public void cancelReservation(LibraryMember member, Book book) {
        if (book.isReserved() && member.hasReservedBook(book)) {
            book.setReserved(false);
            member.removeReservedBook(book);
        }
    }

    public void displayReservedBooks(LibraryMember member) {
        member.getReservedBooks().forEach(book -> System.out.println(book.getTitle()));
    }
}
