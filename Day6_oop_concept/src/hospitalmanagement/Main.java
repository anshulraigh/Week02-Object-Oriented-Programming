// HospitalManagementSystem.java
package hospitalmanagement;

public class Main {
    public static void main(String[] args) {
        Patient inPatient = new InPatient(101, "Vivek", 21, 1500.0, 5);
        inPatient.getPatientDetails();
        ((MedicalRecord) inPatient).addRecord("Admitted for surgery");
        ((MedicalRecord) inPatient).viewRecords();
        System.out.println();

        Patient outPatient = new OutPatient(102, "Anshul Rai", 30, 500.0);
        outPatient.getPatientDetails();
        ((MedicalRecord) outPatient).addRecord("Routine check-up");
        ((MedicalRecord) outPatient).viewRecords();
    }
}
