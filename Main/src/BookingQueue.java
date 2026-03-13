import java.util.LinkedList;
import java.util.Queue;

/**
 * Manages booking requests using FIFO queue.
 */
public class BookingQueue {

    private Queue<Reservation> requestQueue;

    public BookingQueue() {
        requestQueue = new LinkedList<>();
    }

    public void addRequest(Reservation reservation) {
        requestQueue.add(reservation);
        System.out.println("Booking request added for " + reservation.getGuestName());
    }

    public void displayRequests() {

        System.out.println("\nCurrent Booking Queue:");

        for (Reservation r : requestQueue) {
            r.displayReservation();
        }
    }
}