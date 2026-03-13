import java.util.LinkedList;
import java.util.Queue;

/**
 * Hotel Booking System
 * Demonstrates reservation confirmation and room allocation.
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("=== Hotel Booking System ===");

        RoomInventory inventory = new RoomInventory();

        Queue<Reservation> requestQueue = new LinkedList<>();

        // simulate booking requests
        requestQueue.add(new Reservation("Alice", "Single Room"));
        requestQueue.add(new Reservation("Bob", "Double Room"));
        requestQueue.add(new Reservation("Charlie", "Single Room"));

        BookingService bookingService =
                new BookingService(inventory, requestQueue);

        bookingService.processBookings();
    }
}