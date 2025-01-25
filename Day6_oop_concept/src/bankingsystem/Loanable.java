package bankingsystem;

public interface Loanable {
    boolean applyForLoan(double amount);  // Method to apply for a loan
    boolean calculateLoanEligibility();   // Method to calculate loan eligibility
}
