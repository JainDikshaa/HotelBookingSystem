public class Main {
    public static void main(String[] args) {

        BookingHistory history = new BookingHistory();
        BookingReportService reportService = new BookingReportService();

        Reservation r1 = new Reservation("Diksha", "Deluxe");
        Reservation r2 = new Reservation("Rahul", "Suite");
        Reservation r3 = new Reservation("Ananya", "Standard");

        // Add to booking history (ONLY after confirmation)
        history.addReservation(r1);
        history.addReservation(r2);
        history.addReservation(r3);

        // Admin views all bookings
        reportService.showAllBookings(history);

        // Admin views summary
        reportService.generateSummary(history);
    }
}