import java.util.*;

public class Main {
    public static void main(String[] args) {

        PersistenceService service = new PersistenceService();

        // Load previous data (startup recovery)
        Object[] data = service.loadData();
        List<Reservation> reservations = (List<Reservation>) data[0];
        Map<String, Integer> inventory = (Map<String, Integer>) data[1];

        // Simulate adding new booking
        Reservation r1 = new Reservation("Diksha", "Deluxe");
        reservations.add(r1);

        inventory.put("Deluxe", inventory.getOrDefault("Deluxe", 5) - 1);

        System.out.println("Current reservations: " + reservations.size());

        // Save data before shutdown
        service.saveData(reservations, inventory);
    }
}
