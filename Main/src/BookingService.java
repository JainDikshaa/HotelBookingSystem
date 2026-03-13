import java.util.*;

/**
 * Processes booking requests and allocates rooms safely.
 */
public class BookingService {

    private RoomInventory inventory;
    private Queue<Reservation> requestQueue;

    // Map room type -> allocated room IDs
    private Map<String, Set<String>> allocatedRooms;

    public BookingService(RoomInventory inventory, Queue<Reservation> requestQueue) {
        this.inventory = inventory;
        this.requestQueue = requestQueue;
        this.allocatedRooms = new HashMap<>();
    }

    public void processBookings() {

        while (!requestQueue.isEmpty()) {

            Reservation reservation = requestQueue.poll();
            String roomType = reservation.getRoomType();

            int available = inventory.getAvailability(roomType);

            if (available > 0) {

                // generate unique room ID
                String roomId = roomType.replace(" ", "") + "-" + (available);

                allocatedRooms.putIfAbsent(roomType, new HashSet<>());

                Set<String> roomSet = allocatedRooms.get(roomType);

                if (!roomSet.contains(roomId)) {

                    roomSet.add(roomId);

                    // decrement inventory
                    inventory.updateAvailability(roomType, available - 1);

                    System.out.println(
                            "Reservation confirmed for "
                                    + reservation.getGuestName()
                                    + " | Room ID: "
                                    + roomId
                    );
                }

            } else {

                System.out.println(
                        "Reservation failed for "
                                + reservation.getGuestName()
                                + " | No rooms available."
                );
            }
        }
    }
}