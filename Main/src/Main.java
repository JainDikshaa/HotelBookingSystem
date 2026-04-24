public class Main {
    public static void main(String[] args) {

        SharedBookingResource resource = new SharedBookingResource(2);

        Thread t1 = new Thread(new BookingTask("Guest1", resource));
        Thread t2 = new Thread(new BookingTask("Guest2", resource));
        Thread t3 = new Thread(new BookingTask("Guest3", resource));

        t1.start();
        t2.start();
        t3.start();
    }
}