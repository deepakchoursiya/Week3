package Day01.doubly_linkedlist.librarymanagement_system;

public class LibraryManagement {
    private BookNode head;

    // Add a new book at the beginning
    public void addAtBeginning(String title, String author, String genre, int bookID, boolean isAvailable) {
        BookNode newNode = new BookNode(title, author, genre, bookID, isAvailable);
        if (head != null) {
            newNode.next = head;
            head.prev = newNode;
        }
        head = newNode;
    }

    // Add a new book at the end
    public void addAtEnd(String title, String author, String genre, int bookID, boolean isAvailable) {
        BookNode newNode = new BookNode(title, author, genre, bookID, isAvailable);
        if (head == null) {
            head = newNode;
            return;
        }
        BookNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }

    // Add a new book at a specific position
    public void addAtPosition(String title, String author, String genre, int bookID, boolean isAvailable, int position) {
        BookNode newNode = new BookNode(title, author, genre, bookID, isAvailable);
        if (position == 1) {
            addAtBeginning(title, author, genre, bookID, isAvailable);
            return;
        }
        BookNode temp = head;
        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Position out of range.");
            return;
        }
        newNode.next = temp.next;
        if (temp.next != null) {
            temp.next.prev = newNode;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }

    // Remove a book by Book ID
    public void removeByBookID(int bookID) {
        if (head == null) {
            System.out.println("Library is empty.");
            return;
        }
        if (head.bookID == bookID) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
            return;
        }
        BookNode temp = head;
        while (temp != null && temp.bookID != bookID) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Book with ID " + bookID + " not found.");
            return;
        }
        if (temp.next != null) {
            temp.next.prev = temp.prev;
        }
        if (temp.prev != null) {
            temp.prev.next = temp.next;
        }
    }

    // Search for a book by Title or Author
    public void searchBook(String searchKey) {
        BookNode temp = head;
        boolean found = false;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(searchKey) || temp.author.equalsIgnoreCase(searchKey)) {
                System.out.println("Book Found: " + temp.title + " by " + temp.author + " (Genre: " + temp.genre + ", ID: " + temp.bookID + ", Available: " + temp.isAvailable + ")");
                found = true;
            }
            temp = temp.next;
        }
        if (!found) {
            System.out.println("No book found with the search key: " + searchKey);
        }
    }

    // Update the availability status of a book
    public void updateAvailability(int bookID, boolean newStatus) {
        BookNode temp = head;
        while (temp != null) {
            if (temp.bookID == bookID) {
                temp.isAvailable = newStatus;
                System.out.println("Availability status updated for book ID " + bookID);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Book with ID " + bookID + " not found.");
    }

    // Display all books in forward order
    public void displayForward() {
        if (head == null) {
            System.out.println("Library is empty.");
            return;
        }
        BookNode temp = head;
        while (temp != null) {
            System.out.println(temp.title + " by " + temp.author + " (Genre: " + temp.genre + ", ID: " + temp.bookID + ", Available: " + temp.isAvailable + ")");
            temp = temp.next;
        }
    }

    // Display all books in reverse order
    public void displayReverse() {
        if (head == null) {
            System.out.println("Library is empty.");
            return;
        }
        BookNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        while (temp != null) {
            System.out.println(temp.title + " by " + temp.author + " (Genre: " + temp.genre + ", ID: " + temp.bookID + ", Available: " + temp.isAvailable + ")");
            temp = temp.prev;
        }
    }

    // Count the total number of books in the library
    public int countBooks() {
        int count = 0;
        BookNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
}
