public class Main {
    public static void main(String[] args) {

        AddOnServiceManager manager = new AddOnServiceManager();

        // Assume reservation already exists (important: we are NOT modifying it)
        String reservationId = "RES123";

        // Create some services
        AddOnService breakfast = new AddOnService("S1", "Breakfast", 500);
        AddOnService spa = new AddOnService("S2", "Spa", 1500);
        AddOnService pickup = new AddOnService("S3", "Airport Pickup", 800);

        // Guest selects services
        manager.addService(reservationId, breakfast);
        manager.addService(reservationId, spa);
        manager.addService(reservationId, pickup);

        // Display services
        System.out.println("Services for Reservation " + reservationId + ":");
        for (AddOnService s : manager.getServices(reservationId)) {
            System.out.println(s);
        }

        // Calculate total additional cost
        double totalCost = manager.calculateTotalServiceCost(reservationId);
        System.out.println("Total Add-On Cost: Rs." + totalCost);
    }
}