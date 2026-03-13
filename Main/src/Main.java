/**
 * Hotel Booking System
 * Demonstrates FIFO booking request queue.
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("=== Hotel Booking System ===");

        BookingQueue queue = new BookingQueue();

        // guests submit booking requests
        queue.addRequest(new Reservation("Alice", "Single Room"));
        queue.addRequest(new Reservation("Bob", "Double Room"));
        queue.addRequest(new Reservation("Charlie", "Suite Room"));

        // display queue
        queue.displayRequests();
    }
}