package ridehailing;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create a list to hold various vehicles
        ArrayList<Vehicle> vehicles = new ArrayList<>();

        // Add different types of vehicles to the list
        vehicles.add(new Car(101, "Anshul", 15.0, "Chhindwara"));
        vehicles.add(new Bike(102, "Anand", 8.0, "Parasia"));
        vehicles.add(new Auto(103, "Ankit", 10.0, "Bihar"));

        // Demonstrate polymorphism for fare calculation
        double distance = 10.5; // Example distance in km
        for (Vehicle vehicle : vehicles) {
            System.out.println("----- Vehicle Details -----");
            vehicle.getVehicleDetails();
            System.out.println("Fare for " + distance + " km: " + vehicle.calculateFare(distance));

            // If the vehicle implements GPS, use its methods
            if (vehicle instanceof GPS gps) {
                System.out.println("Current Location: " + gps.getCurrentLocation());
                gps.updateLocation("New Location");
                System.out.println("Updated Location: " + gps.getCurrentLocation());
            }
            System.out.println();
        }
    }
}
