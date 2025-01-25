package hospitalmanagement;

import java.util.ArrayList;
import java.util.List;

class OutPatient extends Patient implements MedicalRecord {
    private List<String> records = new ArrayList<>();
    private double consultationFee;

    public OutPatient(int patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
    }

    @Override
    public double calculateBill() {
        return consultationFee;
    }

    @Override
    public void addRecord(String record) {
        records.add(record);
        System.out.println("Record added for OutPatient: " + record);
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical Records for OutPatient:");
        for (String record : records) {
            System.out.println(record);
        }
    }
}
