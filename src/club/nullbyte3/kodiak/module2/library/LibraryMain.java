package club.nullbyte3.kodiak.module2.library;

public class LibraryMain {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook(new Book("Introduction to Java Programming", "John Smith", 2020));
        library.addBook(new Book("Data Structures and Algorithms", "Jane Doe", 2018));
        library.addBook(new Book("The Art of Fiction", "Alice Johnson", 2019));

        library.displayBooks();

        System.out.println("Books by Author Jane Doe:");
        library.findBooksByAuthor("Jane Doe");
    }
}