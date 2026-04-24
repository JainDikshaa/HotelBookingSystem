public class Main {
    public static void main(String[] args) {

        String guestName = "Diksha";
        String roomType = "Deluxe";   // change to test invalid cases
        int availableRooms = 2;       // change to 0 to test failure

        try {
            // Step 1: Validate BEFORE booking
            InvalidBookingValidator.validateBooking(guestName, roomType, availableRooms);

            // Step 2: Proceed only if valid
            Reservation reservation = new Reservation(guestName, roomType);
            System.out.println("Booking successful: " + reservation);

        } catch (InvalidBookingException e) {
            // Step 3: Graceful failure (no crash)
            System.out.println("Booking failed: " + e.getMessage());
        }

        // System continues running
        System.out.println("System is still running...");
    }
}