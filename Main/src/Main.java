/**
 * Hotel Booking System
 * Demonstrates room search and availability check.
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("=== Hotel Booking System ===");

        RoomInventory inventory = new RoomInventory();

        SearchService searchService = new SearchService(inventory);

        searchService.displayAvailableRooms();
    }
}