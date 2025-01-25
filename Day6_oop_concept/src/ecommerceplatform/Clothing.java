package ecommerceplatform;

public class Clothing extends Product implements Taxable {
    private double discountPercentage;

    public Clothing(int productId, String name, double price, double discountPercentage) {
        super(productId, name, price);
        this.discountPercentage = discountPercentage;
    }

    // Implement abstract method for calculating discount
    @Override
    public double calculateDiscount() {
        return getPrice() * discountPercentage / 100;
    }

    // Implement Taxable interface methods
    @Override
    public double calculateTax() {
        return getPrice() * 0.05; // 5% tax on clothing
    }

    @Override
    public String getTaxDetails() {
        return "Tax on Clothing: 5%";
    }
}
