import java.util.*;

public class CancellationService {

    private Set<String> activeReservations = new HashSet<>();
    private Stack<String> releasedRooms = new Stack<>();
    private Map<String, Integer> inventory = new HashMap<>();

    // Add initial data (simulate existing bookings)
    public void addReservation(String reservationId, String roomType) {
        activeReservations.add(reservationId);
        inventory.put(roomType, inventory.getOrDefault(roomType, 0) - 1);
    }

    // Cancel booking
    public void cancelBooking(String reservationId, String roomType, String roomId) {

        // Validate
        if (!activeReservations.contains(reservationId)) {
            System.out.println("Cancellation failed: Reservation does not exist.");
            return;
        }

        // Remove reservation
        activeReservations.remove(reservationId);

        // Rollback room allocation (LIFO)
        releasedRooms.push(roomId);

        // Restore inventory
        inventory.put(roomType, inventory.getOrDefault(roomType, 0) + 1);

        System.out.println("Cancellation successful for " + reservationId);
    }
}