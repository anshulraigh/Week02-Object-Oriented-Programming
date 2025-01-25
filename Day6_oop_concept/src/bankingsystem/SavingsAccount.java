package bankingsystem;

public class SavingsAccount extends BankAccount implements Loanable {
    private static final double INTEREST_RATE = 0.05;  // 5% interest rate

    public SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    // Implement the abstract method for interest calculation
    @Override
    public double calculateInterest() {
        return getBalance() * INTEREST_RATE;
    }

    // Implement Loanable methods
    @Override
    public boolean applyForLoan(double amount) {
        return amount <= getBalance() * 5;  // Eligible for loan up to 5 times the balance
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() > 5000;  // Eligible for loan if balance is above 5000
    }
}
