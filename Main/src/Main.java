/**
 * Hotel Booking Management System
 * Demonstrates room types and static availability.
 */

public class Main {

    public static void main(String[] args) {

        System.out.println("=== Hotel Booking System ===");

        Room single = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suite = new SuiteRoom();

        // Static availability variables
        int singleAvailable = 5;
        int doubleAvailable = 3;
        int suiteAvailable = 2;

        System.out.println("\nSingle Room Details:");
        single.displayDetails();
        System.out.println("Available: " + singleAvailable);

        System.out.println("\nDouble Room Details:");
        doubleRoom.displayDetails();
        System.out.println("Available: " + doubleAvailable);

        System.out.println("\nSuite Room Details:");
        suite.displayDetails();
        System.out.println("Available: " + suiteAvailable);
    }
}