package vehiclerentalsystem;

public class Bike extends Vehicle implements Insurable {
    private boolean hasGear;

    public Bike(String vehicleNumber, String type, double rentalRate, boolean hasGear) {
        super(vehicleNumber, type, rentalRate);
        this.hasGear = hasGear;
    }

    // Implement abstract method for calculating rental cost
    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    // Implement Insurable interface methods
    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.05; // 5% of rental rate as insurance
    }

    @Override
    public String getInsuranceDetails() {
        return "Insurance for Bike: 5% of rental rate";
    }
}
