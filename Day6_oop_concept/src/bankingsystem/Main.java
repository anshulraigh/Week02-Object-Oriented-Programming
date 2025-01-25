package bankingsystem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a list of bank accounts
        List<BankAccount> accounts = new ArrayList<>();

        // Add SavingsAccount
        SavingsAccount savings = new SavingsAccount("SA123", "Abc", 8000);
        accounts.add(savings);

        // Add CurrentAccount
        CurrentAccount current = new CurrentAccount("CA123", "Bcd", 15000);
        accounts.add(current);

        // Process accounts using polymorphism
        for (BankAccount account : accounts) {
            System.out.println("Account Holder: " + account.getHolderName());
            System.out.println("Balance: " + account.getBalance());
            System.out.println("Interest: " + account.calculateInterest());

            // Check loan eligibility and apply for loan
            if (account instanceof Loanable loanableAccount) {
                System.out.println("Loan eligibility: " + loanableAccount.calculateLoanEligibility());
                if (loanableAccount.applyForLoan(10000)) {
                    System.out.println("Loan applied successfully.");
                } else {
                    System.out.println("Loan application denied.");
                }
            }
            System.out.println("----------------------------");
        }
    }
}
