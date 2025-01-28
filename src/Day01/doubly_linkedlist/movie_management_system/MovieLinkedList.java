package Day01.doubly_linkedlist.movie_management_system;

public class MovieLinkedList {
    private MovieNode head;
    private MovieNode tail;

    // Add a movie at the beginning
    public void addAtBeginning(String title, String director, int year, double rating) {
        MovieNode newNode = new MovieNode(title, director, year, rating);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    // Add a movie at the end
    public void addAtEnd(String title, String director, int year, double rating) {
        MovieNode newNode = new MovieNode(title, director, year, rating);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Add a movie at a specific position
    public void addAtPosition(int position, String title, String director, int year, double rating) {
        if (position < 1) {
            System.out.println("Position must be greater than 0");
            return;
        }
        MovieNode newNode = new MovieNode(title, director, year, rating);
        if (position == 1) {
            addAtBeginning(title, director, year, rating);
            return;
        }
        MovieNode current = head;
        for (int i = 1; i < position - 1 && current != null; i++) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Position out of bounds");
            return;
        }
        newNode.next = current.next;
        newNode.prev = current;
        if (current.next != null) {
            current.next.prev = newNode;
        } else {
            tail = newNode;
        }
        current.next = newNode;
    }

    // Remove a movie by title
    public void removeByTitle(String title) {
        if (head == null) {
            System.out.println("No movies in the list");
            return;
        }
        MovieNode current = head;
        while (current != null) {
            if (current.title.equalsIgnoreCase(title)) {
                if (current == head) {
                    head = head.next;
                    if (head != null) head.prev = null;
                } else if (current == tail) {
                    tail = tail.prev;
                    if (tail != null) tail.next = null;
                } else {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }
                System.out.println("Movie \"" + title + "\" removed successfully");
                return;
            }
            current = current.next;
        }
        System.out.println("Movie \"" + title + "\" not found");
    }

    // Search for a movie by director or rating
    public void searchByDirectorOrRating(String director, double rating) {
        MovieNode current = head;
        boolean found = false;
        while (current != null) {
            if (current.director.equalsIgnoreCase(director) || current.rating == rating) {
                System.out.println("Found Movie: Title: " + current.title + ", Director: " + current.director + ", Year: " + current.year + ", Rating: " + current.rating);
                found = true;
            }
            current = current.next;
        }
        if (!found) {
            System.out.println("No movie found with Director \"" + director + "\" or Rating " + rating);
        }
    }

    // Display all movies in forward order
    public void displayForward() {
        if (head == null) {
            System.out.println("No movies in the list");
            return;
        }
        System.out.println("Movies in Forward Order:");
        MovieNode current = head;
        while (current != null) {
            System.out.println("Title: " + current.title + ", Director: " + current.director + ", Year: " + current.year + ", Rating: " + current.rating);
            current = current.next;
        }
    }

    // Display all movies in reverse order
    public void displayReverse() {
        if (tail == null) {
            System.out.println("No movies in the list");
            return;
        }
        System.out.println("Movies in Reverse Order:");
        MovieNode current = tail;
        while (current != null) {
            System.out.println("Title: " + current.title + ", Director: " + current.director + ", Year: " + current.year + ", Rating: " + current.rating);
            current = current.prev;
        }
    }

    // Update a movie's rating by title
    public void updateRating(String title, double newRating) {
        MovieNode current = head;
        while (current != null) {
            if (current.title.equalsIgnoreCase(title)) {
                current.rating = newRating;
                System.out.println("Updated rating of \"" + title + "\" to " + newRating);
                return;
            }
            current = current.next;
        }
        System.out.println("Movie \"" + title + "\" not found");
    }
}
