public class SharedBookingResource {

    private int availableRooms;

    public SharedBookingResource(int rooms) {
        this.availableRooms = rooms;
    }

    // Critical section (only one thread at a time)
    public synchronized void bookRoom(String guestName) {

        if (availableRooms > 0) {
            System.out.println(guestName + " is booking...");

            // simulate delay (to expose race condition if no sync)
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            availableRooms--;
            System.out.println("Booking confirmed for " + guestName +
                    ". Rooms left: " + availableRooms);
        } else {
            System.out.println("No rooms available for " + guestName);
        }
    }
}