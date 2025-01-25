package ecommerceplatform;

public class Groceries extends Product {
    private double discountPercentage;

    public Groceries(int productId, String name, double price, double discountPercentage) {
        super(productId, name, price);
        this.discountPercentage = discountPercentage;
    }

    // Implement abstract method for calculating discount
    @Override
    public double calculateDiscount() {
        return getPrice() * discountPercentage / 100;
    }

    // No need to implement Taxable, as groceries are exempt from tax
    public double calculateTax() {
        return 0;  // No tax for groceries
    }

    public String getTaxDetails() {
        return "Groceries are not taxable.";
    }
}
