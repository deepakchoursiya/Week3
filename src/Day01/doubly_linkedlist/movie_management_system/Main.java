package Day01.doubly_linkedlist.movie_management_system;

public class Main {
    public static void main(String[] args) {
        MovieLinkedList movieList = new MovieLinkedList();

        // Adding movies
        movieList.addAtBeginning("Inception", "Christopher Nolan", 2010, 9.0);
        movieList.addAtEnd("The Godfather", "Francis Ford Coppola", 1972, 9.2);
        movieList.addAtPosition(2, "Interstellar", "Christopher Nolan", 2014, 8.6);

        // Display all movies in forward order
        movieList.displayForward();

        // Display all movies in reverse order
        movieList.displayReverse();

        // Search for a movie
        movieList.searchByDirectorOrRating("Christopher Nolan", 9.2);

        // Update a movie rating
        movieList.updateRating("Interstellar", 9.0);

        // Remove a movie by title
        movieList.removeByTitle("Inception");

        // Display all movies after removal
        movieList.displayForward();
    }
}
