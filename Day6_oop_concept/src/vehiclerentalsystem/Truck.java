package vehiclerentalsystem;

public class Truck extends Vehicle implements Insurable {
    private int loadCapacity;

    public Truck(String vehicleNumber, String type, double rentalRate, int loadCapacity) {
        super(vehicleNumber, type, rentalRate);
        this.loadCapacity = loadCapacity;
    }

    // Implement abstract method for calculating rental cost
    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days + loadCapacity * 0.2; // Extra charge based on load capacity
    }

    // Implement Insurable interface methods
    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.12; // 12% of rental rate as insurance
    }

    @Override
    public String getInsuranceDetails() {
        return "Insurance for Truck: 12% of rental rate";
    }
}
