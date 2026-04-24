import java.util.*;

public class InvalidBookingValidator {

    // Valid room types (you can match with your system)
    private static final Set<String> validRoomTypes =
            new HashSet<>(Arrays.asList("Single", "Double", "Suite"));

    // Validate booking input
    public static void validateBooking(String guestName, String roomType, int availableRooms)
            throws InvalidBookingException {

        // Check guest name
        if (guestName == null || guestName.trim().isEmpty()) {
            throw new InvalidBookingException("Guest name cannot be empty.");
        }

        // Check room type
        if (!validRoomTypes.contains(roomType)) {
            throw new InvalidBookingException("Invalid room type selected.");
        }

        // Check availability
        if (availableRooms <= 0) {
            throw new InvalidBookingException("No rooms available for selected type.");
        }
    }
}