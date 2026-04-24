import java.util.*;

public class BookingHistory {

    private List<Reservation> reservationList;

    public BookingHistory() {
        reservationList = new ArrayList<>();
    }

    // Add confirmed reservation
    public void addReservation(Reservation reservation) {
        reservationList.add(reservation);
    }

    // Get all reservations (read-only purpose)
    public List<Reservation> getAllReservations() {
        return new ArrayList<>(reservationList); // return copy to prevent modification
    }
}