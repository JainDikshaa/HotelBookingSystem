import java.io.*;
import java.util.*;

public class PersistenceService {

    private static final String FILE_NAME = "data.ser";

    // Save data
    public void saveData(List<Reservation> reservations, Map<String, Integer> inventory) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(reservations);
            oos.writeObject(inventory);
            System.out.println("Data saved successfully.");
        } catch (IOException e) {
            System.out.println("Error saving data: " + e.getMessage());
        }
    }

    // Load data
    @SuppressWarnings("unchecked")
    public Object[] loadData() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            List<Reservation> reservations = (List<Reservation>) ois.readObject();
            Map<String, Integer> inventory = (Map<String, Integer>) ois.readObject();
            System.out.println("Data loaded successfully.");
            return new Object[]{reservations, inventory};
        } catch (Exception e) {
            System.out.println("No previous data found. Starting fresh.");
            return new Object[]{new ArrayList<Reservation>(), new HashMap<String, Integer>()};
        }
    }
}