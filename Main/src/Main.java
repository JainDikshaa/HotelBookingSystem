public class Main {
    public static void main(String[] args) {

        CancellationService service = new CancellationService();

        // Simulate an existing booking
        service.addReservation("RES201", "Deluxe");

        // Cancel it
        service.cancelBooking("RES201", "Deluxe", "ROOM101");

        // Try cancelling again (should fail)
        service.cancelBooking("RES201", "Deluxe", "ROOM101");
    }
}