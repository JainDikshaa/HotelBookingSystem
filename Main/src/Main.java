/**
 * Hotel Booking System
 * Demonstrates centralized inventory management using HashMap.
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("=== Hotel Booking System ===");

        RoomInventory inventory = new RoomInventory();

        // display inventory
        inventory.displayInventory();

        // simulate update
        System.out.println("\nUpdating availability for Single Room...");

        inventory.updateAvailability("Single Room", 4);

        inventory.displayInventory();
    }
}
