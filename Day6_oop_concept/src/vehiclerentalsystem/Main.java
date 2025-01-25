package vehiclerentalsystem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a list to store vehicles
        List<Vehicle> vehicles = new ArrayList<>();

        // Add Car
        Car car = new Car("C123", "Car", 1500, 1500);
        vehicles.add(car);

        // Add Bike
        Bike bike = new Bike("B123", "Bike", 500, true);
        vehicles.add(bike);

        // Add Truck
        Truck truck = new Truck("T123", "Truck", 3000, 5000);
        vehicles.add(truck);

        // Process vehicles using polymorphism
        for (Vehicle vehicle : vehicles) {
            vehicle.displayDetails();
            int rentalDays = 5; // Example for 5 days rental
            double rentalCost = vehicle.calculateRentalCost(rentalDays);
            System.out.println("Rental Cost for " + rentalDays + " days: " + rentalCost);

            if (vehicle instanceof Insurable) {
                Insurable insurableVehicle = (Insurable) vehicle;
                double insuranceCost = insurableVehicle.calculateInsurance();
                System.out.println("Insurance Cost: " + insuranceCost);
                System.out.println(insurableVehicle.getInsuranceDetails());
            }
            System.out.println("----------------------------");
        }
    }
}
