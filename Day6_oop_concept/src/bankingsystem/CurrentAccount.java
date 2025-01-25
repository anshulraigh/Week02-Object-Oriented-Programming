package bankingsystem;

public class CurrentAccount extends BankAccount implements Loanable {
    private static final double INTEREST_RATE = 0.02;  // 2% interest rate

    public CurrentAccount(String accountNumber, String holderName, double balance) {
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
        return amount <= getBalance() * 2;  // Eligible for loan up to 2 times the balance
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() > 10000;  // Eligible for loan if balance is above 10000
    }
}
