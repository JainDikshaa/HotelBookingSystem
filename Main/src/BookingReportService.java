import java.util.List;

public class BookingReportService {

    // Display all bookings
    public void showAllBookings(BookingHistory history) {
        List<Reservation> reservations = history.getAllReservations();

        System.out.println("----- Booking History -----");
        for (Reservation r : reservations) {
            System.out.println(r);
        }
    }

    // Generate summary report
    public void generateSummary(BookingHistory history) {
        List<Reservation> reservations = history.getAllReservations();

        int totalBookings = reservations.size();

        System.out.println("----- Booking Summary -----");
        System.out.println("Total Bookings: " + totalBookings);
    }
}