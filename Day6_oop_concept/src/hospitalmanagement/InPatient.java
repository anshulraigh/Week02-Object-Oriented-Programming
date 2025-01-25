package hospitalmanagement;

import java.util.ArrayList;
import java.util.List;

class InPatient extends Patient implements MedicalRecord {
    private List<String> records = new ArrayList<>();
    private double dailyCharge;
    private int numberOfDays;

    public InPatient(int patientId, String name, int age, double dailyCharge, int numberOfDays) {
        super(patientId, name, age);
        this.dailyCharge = dailyCharge;
        this.numberOfDays = numberOfDays;
    }

    @Override
    public double calculateBill() {
        return dailyCharge * numberOfDays;
    }

    @Override
    public void addRecord(String record) {
        records.add(record);
        System.out.println("Record added for InPatient: " + record);
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical Records for InPatient:");
        for (String record : records) {
            System.out.println(record);
        }
    }
}
