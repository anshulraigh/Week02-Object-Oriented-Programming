package vehiclerentalsystem;

public class Car extends Vehicle implements Insurable {
    private int engineCapacity;

    public Car(String vehicleNumber, String type, double rentalRate, int engineCapacity) {
        super(vehicleNumber, type, rentalRate);
        this.engineCapacity = engineCapacity;
    }

    // Implement abstract method for calculating rental cost
    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    // Implement Insurable interface methods
    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.10; // 10% of rental rate as insurance
    }

    @Override
    public String getInsuranceDetails() {
        return "Insurance for Car: 10% of rental rate";
    }
}
