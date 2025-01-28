package Day01.doubly_linkedlist.librarymanagement_system;

public class Main {
    public static void main(String[] args) {
        LibraryManagement library = new LibraryManagement();

        // Adding books
        library.addAtEnd("Book1", "Author1", "Fiction", 101, true);
        library.addAtBeginning("Book2", "Author2", "Mystery", 102, false);
        library.addAtPosition("Book3", "Author3", "Science", 103, true, 2);

        // Display books
        System.out.println("Books in forward order:");
        library.displayForward();

        System.out.println("\nBooks in reverse order:");
        library.displayReverse();

        // Search for a book
        System.out.println("\nSearching for a book by title 'Book1':");
        library.searchBook("Book1");

        // Update availability
        System.out.println("\nUpdating availability of book ID 101:");
        library.updateAvailability(101, false);

        // Remove a book
        System.out.println("\nRemoving book with ID 102:");
        library.removeByBookID(102);

        // Display books after removal
        System.out.println("\nBooks in forward order after removal:");
        library.displayForward();

        // Count books
        System.out.println("\nTotal number of books in the library: " + library.countBooks());
    }
}
