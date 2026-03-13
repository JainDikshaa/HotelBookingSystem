/**
 * Provides read-only search functionality for available rooms.
 * Does not modify inventory state.
 */
public class SearchService {

    private RoomInventory inventory;

    public SearchService(RoomInventory inventory) {
        this.inventory = inventory;
    }

    public void displayAvailableRooms() {

        System.out.println("\nAvailable Rooms:");

        Room single = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suite = new SuiteRoom();

        if (inventory.getAvailability("Single Room") > 0) {
            single.displayDetails();
            System.out.println("Available: " + inventory.getAvailability("Single Room"));
            System.out.println();
        }

        if (inventory.getAvailability("Double Room") > 0) {
            doubleRoom.displayDetails();
            System.out.println("Available: " + inventory.getAvailability("Double Room"));
            System.out.println();
        }

        if (inventory.getAvailability("Suite Room") > 0) {
            suite.displayDetails();
            System.out.println("Available: " + inventory.getAvailability("Suite Room"));
            System.out.println();
        }
    }
}