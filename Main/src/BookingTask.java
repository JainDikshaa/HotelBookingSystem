public class BookingTask implements Runnable {

    private String guestName;
    private SharedBookingResource resource;

    public BookingTask(String guestName, SharedBookingResource resource) {
        this.guestName = guestName;
        this.resource = resource;
    }

    @Override
    public void run() {
        resource.bookRoom(guestName);
    }
}