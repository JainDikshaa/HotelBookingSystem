public class AddOnService {
    private String serviceId;
    private String serviceName;
    private double cost;

    public AddOnService(String serviceId, String serviceName, double cost) {
        this.serviceId = serviceId;
        this.serviceName = serviceName;
        this.cost = cost;
    }

    public String getServiceId() {
        return serviceId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public double getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return serviceName + " (Rs." + cost + ")";
    }
}